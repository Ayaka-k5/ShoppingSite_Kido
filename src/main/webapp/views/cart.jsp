<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/product.css" rel="stylesheet">
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../header.html"%>

<header>
	<nav>
		<ul>
			<li><a href="/ShoppingSite/index_Customer.jsp">Hug Me</a></li>
			<li><a href="/ShoppingSite/views/productA.jsp">商品一覧</a></li>
			<li><a href="/ShoppingSite/views/login_Customer.jsp">ログイン/新規登録</a></li>
			<li><a href="/ShoppingSite/views/logout_Customer.jsp">ログアウト</a></li>
			<li><a href="/ShoppingSite/views/cart.jsp">カート</a></li>
		</ul>
	</nav>
</header>

<div class="productCustomer">
<h1>Hug Me</h1>

<h1>カート</h1>
</div>

<c:forEach var="item" items="${cart}">
<div class="productCustomer">
	<p>
	<img  class="productImage" src="/ShoppingSite/img/${item.product.product_id}.jpg" alt="product_image" /><br>
	${item.product.product_name}<br>
	<c:set var="tax" value="${Math.round(item.product.product_price * 1.1)}"></c:set>
	${tax}円（税込み）<br>
	${item.product_number}個<br>
	<c:set var="subTotal" value="${tax * item.product_number}"></c:set>
	小計：${subTotal}
	<c:set var="total" value="${total + subTotal}"></c:set>
	<input type="hidden" name="product_id"
		value="${item.product.product_id}">
	<br>
	</p>
	</div>
</c:forEach>

<div class="productCustomer">
<p>合計：${total}円</p>

<p>
	<button class="productButton" type=button
		onclick="location.href='/ShoppingSite/views/buy_confirm.jsp'">購入</button>
</p>
</form>

<img  class="mainImage" src="/ShoppingSite/img/duffy_friends2.png">

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>
<div class="productCustomer">

<%@include file="../footer.html"%>