<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/logout_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="logoutCustomer">
	<p>ログアウトしました。</p>

	<p>
		<button class="logoutButton" type=button
			onclick="location.href='/ShoppingSite/views/login-choice.jsp'">ログインページへ</button>
	</p>
</div>

<%@include file="../footer.html"%>