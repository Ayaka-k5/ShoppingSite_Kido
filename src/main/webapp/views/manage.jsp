<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>商品管理 登録</h1>

<form action="/ShoppingSite/confirmServlet_Customer" method="post">
	<p>商品画像</p>
	<input type="image" name="customer_password" required>

	<p>商品名</p>
	<input type="text" name="product_mailaddress" required>

	<p>価格</p>
	<input type="text" name="customer_lastname" required>

	<p>
		<input type="submit" value="登録">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>