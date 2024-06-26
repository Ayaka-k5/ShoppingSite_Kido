<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/logout_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="logoutCustomer">
	<p>すでにログアウトしています。</p>

	<p>
		<button class="logoutButton" type=button
			onclick="location.href='/ShoppingSite/views/login_Manager.jsp'">ログインページへ</button>
	</p>
</div>

<%@include file="../footer.html"%>