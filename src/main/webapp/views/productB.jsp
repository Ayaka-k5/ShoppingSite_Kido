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

	<p>
		商品一覧 <br>全2種類です
	</p>

	<form action="/ShoppingSite/searchServlet" method="post">
		<input class="form" type="text" name="keyword"> <input
			class="productButton" type="submit" value="検索">
	</form>
</div>

<c:forEach var="product" items="${list}">
	<div class="productCustomer">
		<form action="/ShoppingSite/cartServlet" method="post">
			<p>
				<img class="productImage" src="/ShoppingSite/img/${product.product_id}.jpg"
					alt="product_image" /><br>
				${product.product_name}<br>
				${product.product_price}円（税抜き）<br>
				${product.product_description}<br>
				<input type="hidden" name="product_id" value="${product.product_id}">
				<input class="productButton" type="submit" value="カートに追加">
			</p>
		</form>
	</div>
</c:forEach>

<div class="productCustomer">
	<img class="mainImage" src="/ShoppingSite/img/duffy_friends2.png">

	<p>
		<button class="productButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>