<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>商品管理 登録</h1>

<form action="/ShoppingSite/manageConfirmServlet" method="post">
	<p>商品名</p>
	<input type="text" name="product_name" required>

	<p>価格</p>
	<input type="text" name="product_price" required>
	
	<p>商品説明</p>
	<input type="text" name="product_description" required>
	
	<p>在庫</p>
	<input type="text" name="product_stock" required>

	<p>
		<input type="submit" value="登録">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>