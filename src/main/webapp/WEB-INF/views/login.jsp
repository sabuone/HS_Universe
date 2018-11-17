<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><%@ include file="/WEB-INF/views/include/common_top.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

	<div id="container">
		<h2>로그인</h2>
		
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
			<font color="red"> Your login attempt was not successful due to <br /> <br /> <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" /></font>
			<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session" />
		</c:if>

		<form action="/LoginProcess" method="post">
			<div class="al_l login mgt_30">
				<input type="text" placeholder="아이디 입력" name="userid" value="admin" />
				<input type="password" placeholder="패스워드 입력" name="userpw" value="admin20" />
				<button type="submit">Login</button>
				<input type="checkbox" checked="checked" id="remember-me" name="remember-me" value="Y" /> <label for="remember-me" class="hand">Remember me</label>
			</div>
			<sec:csrfInput />
		</form>
	</div>

<%@ include file="/WEB-INF/views/include/common_bottom.jspf" %>