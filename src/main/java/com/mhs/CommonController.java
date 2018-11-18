package com.mhs;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mhs.service.UserService;

@Controller
public class CommonController {
	
	@Autowired
	UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(HttpSession session) throws Exception {
	//	List<UserVO> userList = userService.selectUserList();
	//	System.out.println(userList.toString());
		/*
		Enumeration<String> e = session.getAttributeNames();
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
			System.out.println("**" + session.getAttribute(s));
		}
		*/

		return "main";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String login() throws Exception {
		return "login";
	}

}
