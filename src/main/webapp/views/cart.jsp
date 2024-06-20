<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../css/style.css"%>
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
<h1>Hug Me</h1>

<form action="buy" method="post">

	<h1>カート</h1>

	<c:forEach var="item" items="${cart}">
		${item.product.product_id}<br>
		<img src="${item.product.product_image}" alt="product_image" />
		<br>
		${item.product.product_name}<br>
		${item.product.product_price}円<br>
		${item.product_number}個<br>
		<input type="hidden" name="product_ids"
			value="${item.product.product_id}">
		<%-- <a href="Cartremove.action?product_id=${item.product.product_id}">
		カートから削除
		</a> --%>
	</c:forEach>

	<input type="submit" value="購入">
</form>

<img src="/ShoppingSite/img/duffy_friends2.png">

<%@include file="../footer.html"%>