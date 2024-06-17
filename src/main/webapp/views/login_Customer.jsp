<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>ログイン(お客様)</h1>

<form action="/ShoppingSite/loginServlet_Customer" method="post">
	<p>メールアドレス</p>
	<input type="email" name="customer_mailaddress" required>
	<p>パスワード</p>
	<input type="password" name="customer_password" required>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<p>or</p>
<p>
	<button type=button onclick="location.href='/ShopptingSite/views/information_Customer.jsp'">新規登録</button>
</p>
<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>