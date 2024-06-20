<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>購入しますか？</h1>

<form action="/ShoppingSite/buyServlet" method="post">
	<c:forEach var="item" items="${cart}">
		${item.product.product_id}<br>
		<img src="${item.product.product_image}" alt="product_image" />
		<br>
		${item.product.product_name}<br>
		${item.product.product_price}円<br>
		${item.product_number}個<br>
		<input type="hidden" name="product_ids"
			value="${item.product.product_id}">
		<br>
</c:forEach>
	<p>
		<input type="submit" value="購入">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>