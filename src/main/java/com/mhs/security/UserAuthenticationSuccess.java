package com.mhs.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AbstractAuthenticationTargetUrlRequestHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.mhs.vo.UserVO;

public class UserAuthenticationSuccess extends AbstractAuthenticationTargetUrlRequestHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res, Authentication authentication) throws IOException, ServletException {
		UserDetail userDetail = (UserDetail) authentication.getPrincipal();
		UserVO user = userDetail.getUser();
		HttpSession session = req.getSession(true);
		session.setAttribute("user", user);
		getRedirectStrategy().sendRedirect(req, res, "/");
	}
	
}