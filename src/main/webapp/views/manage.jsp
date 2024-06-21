<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>商品管理 登録</h1>

<form action="/ShoppingSite/confirmServlet_Customer" method="post">
	<p>商品名</p>
	<input type="email" name="customer_mailaddress" required>

	<p>パスワード</p>
	<input type="password" name="customer_password" required>

	<p>姓</p>
	<input type="text" name="customer_lastname" required>

	<p>名</p>
	<input type="text" name="customer_firstname" required>

	<p>電話番号</p>
	<input type="text" name="customer_telephone" required>

	<p>住所</p>
	<input type="text" name="customer_address" required>

	<p>
		<input type="submit" value="登録">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>