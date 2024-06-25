<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../css/style.css"%>
<%@include file="../header.html"%>

<p>購入しますか？</p>

<c:forEach var="item" items="${cart}">
	${item.product.product_id}<br>
	<img src="/ShoppingSite/img/${item.product.product_id}.jpg" alt="product_image" /><br>
	${item.product.product_name}<br>
	<c:set var="tax" value="${Math.round(item.product.product_price * 1.1)}"></c:set>
	${tax}円（税込み）<br>
	${item.product_number}個<br>
	<c:set var="subTotal" value="${tax * item.product_number}"></c:set>
	小計：${subTotal}
	<c:set var="total" value="${total + subTotal}"></c:set>
	<input type="hidden" name="product_id" value="${item.product.product_id}"><br>
</c:forEach>

合計：${total}円

<p>
	<button type=button
		onclick="location.href='/ShoppingSite/views/buy.jsp'">購入</button>
</p>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>