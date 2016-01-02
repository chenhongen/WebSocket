package cn.ssm.test.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Description: 登录(将用户存入session)
 * @author: che
 * @Date: 2016年1月1日 下午7:28:17
 */
@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		// form表单提交用户登录账号密码
		
		// 查询DB该用户密码是否正确
		
		// 正确:将userCd存入session
		request.getSession().setAttribute("USER_CD", "che");
		return "/main";
	}
	
	@RequestMapping("/web")
	public String dispatch(HttpServletRequest request) {
		return "/websocketTest";
	}
}
