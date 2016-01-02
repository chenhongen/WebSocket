<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>WebSocket Connection Page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
  </head>
  	<script src="js/sockjs.min.js"></script>
    <script type="text/javascript" type="text/javascript">
    	window.onload = function() {
    		//var userCd = "<%=request.getSession().getAttribute("USER_CD") %>";
    		var userCd = "che";
    		if( userCd != null && userCd != "null") {
    			// alert("登录成功");
    			// 登录成功后，建立websocket连接
    			connect();
    		}
    	}
    	
        var ws = null;
        var target = 'ws://localhost:8080/ssm1228/myHandler';

		// 创建WebSocket连接
        function connect() {
            // WebSocket适配
            if ('WebSocket' in window) {  
                ws = new WebSocket(target);  
            } else if ('MozWebSocket' in window) { 
            	alert(11);
                ws = new MozWebSocket(target);  
            } else {
            	// ie10以下
            	if(ws==null) {
            		target = window.location.protocol + '//' + 'localhost:8080/ssm1228/sockjs/myHandler';
                	ws = new SockJS(target);
            	} 
            }  
            // 注入连接事件
            ws.onopen = function () {
                log('连接已建立。');
            };
            // 注入消息事件
            ws.onmessage = function (event) {
                log('新消息：' + event.data);
            };
            // 注入断开事件
      		ws.onclose = function (event) {
                log('连接已断开。');
            };
        }

		// 断开连接
        function disconnect() {
            if (ws != null) {
                ws.close();
                ws = null;
            }
        }

        // 发送消息
        function echo() {
            if (ws != null) {
                log('Sent: ' + message);
                ws.send(message);
            } else {
                alert('connection not established, please connect.');
            }
        }
        
        // 打印消息
        function log(message) {
            var console = document.getElementById('console');
            //var console = window.frames['main'].contentWindow.document.getElementById('console');
            var p = document.createElement('p');
            p.style.wordWrap = 'break-word';
            p.appendChild(document.createTextNode(message));
            console.appendChild(p);
            while (console.childNodes.length > 25) {
                console.removeChild(console.firstChild);
            }
            console.scrollTop = console.scrollHeight;
        }
    </script>
  <body>
  	<iframe id="main" src="<%=basePath%>/web" scrolling="no" frameborder="0" width="100%"></iframe>
  	
    <div id="console-container">
        <div id="console"></div>
    </div>
  </body>
</html>

