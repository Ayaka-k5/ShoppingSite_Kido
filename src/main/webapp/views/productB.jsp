<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../css/style.css"%>
<%@include file="../header.html"%>

<c:forEach var="product" items="${list}">
		<p>
			${product.product_id}<br>
			<img src="/ShoppingSite/img/${product.id}.jpg" alt="product_image" /><br>
			${product.product_name}<br>
			${product.product_price}円（税抜き）<br>
			${product.product_description}<br>
			<input type="hidden" name="product_id" value="${product.product_id}">
		</p>
</c:forEach>

<img src="/ShoppingSite/img/duffy_friends2.png">

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>