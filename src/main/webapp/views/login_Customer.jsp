<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/login_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="loginCustomer">
	<h1>ログイン(お客様)</h1>
	
	<form action="/ShoppingSite/loginServlet_Customer" method="post">
		<p>メールアドレス</p>
		<input class="form" type="email" name="customer_mailaddress" required>
		<p>パスワード</p>
		<input class="form" type="password" name="customer_password" required>
		<p>
			<input class="loginButton" type="submit" value="ログイン">
		</p>
	</form>
	
	<p>or</p>
	<p>
		<button class="loginButton" type=button
			onclick="location.href='/ShoppingSite/views/information_Customer.jsp'">新規登録</button>
	</p>
	<p>
		<button class="loginButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>