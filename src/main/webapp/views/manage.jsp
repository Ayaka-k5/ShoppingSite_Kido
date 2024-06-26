<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/product.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="productCustomer">
	<h1>商品管理 登録</h1>

	<form action="/ShoppingSite/manageConfirmServlet" method="post">
		<p>商品名</p>
		<input class="form" type="text" name="product_name" required>

		<p>価格</p>
		<input class="form" type="text" name="product_price" required>

		<p>商品説明</p>
		<input class="form" type="text" name="product_description" required>

		<p>在庫</p>
		<input class="form" type="text" name="product_stock" required>

		<p>
			<input class="productButton" type="submit" value="登録">
		</p>
	</form>

	<p>
		<button class="productButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>