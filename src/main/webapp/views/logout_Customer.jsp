<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/logout_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="logoutCustomer">
	<h1>ログアウト(お客様)</h1>

	<p>ログアウトしますか？</p>

	<form action="/ShoppingSite/logoutServlet_Customer" method="post">
		<p>
			<input class="logoutButton" type="submit" value="ログアウト">
		</p>
	</form>
	<p>
		<button class="logoutButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>