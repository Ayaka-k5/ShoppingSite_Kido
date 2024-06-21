<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../css/style.css"%>
<%@include file="../header.html"%>

<p>購入しますか？</p>

<%-- <form action="/ShoppingSite/buyServlet" method="post"> --%>
<c:forEach var="item" items="${cart}">
		${item.product.product_id}<br>
	<img src="${item.product.product_image}" alt="product_image" />
	<br>
		${item.product.product_name}<br>
		${item.product.product_price}円<br>
		${item.product_number}個<br>
	<input type="hidden" name="product_id"
		value="${item.product.product_id}">
	<br>
</c:forEach>
<%--<p>
		<input type="submit" value="購入">
	</p>
</form> --%>
<p>
	<button type=button
		onclick="location.href='/ShoppingSite/views/buy.jsp'">購入</button>
</p>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>