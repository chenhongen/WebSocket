package cn.ssm.test.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;
import cn.ssm.test.websocket.MyHandler;

/**
 * 
 * @Description: 发送消息
 * @author: che
 * @Date: 2016年1月1日 下午7:32:15
 */
@Controller
public class SendMsgController {

	/*@Bean
    public MyHandler myHandler() {
        return new MyHandler();
    }*/
	
	@Autowired
	MyHandler myHandler;
	
	@RequestMapping("/tt")
    //@ResponseBody
    public String sendMsgToUser(HttpServletRequest request){
		String msg = "2016，与你相遇，猴幸运！";
    	String userCd = (String) request.getSession().getAttribute("USER_CD");
        myHandler.sendMessageToUser(userCd, new TextMessage(msg));
        return "redirect:/web";
    }
}
