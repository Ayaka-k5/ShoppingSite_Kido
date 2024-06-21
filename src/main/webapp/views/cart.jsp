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

<h1>カート</h1>

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
	<form action="/ShoppingSite/CartDeleteServlet" method="get"
		style="display: inline;">
		<p>
			<input type="hidden" name="product_id"
				value="${item.product.product_id}">
			<button type="submit">削除</button>
		</p>
	</form>
</c:forEach>

<p>
	<button type=button
		onclick="location.href='/ShoppingSite/views/buy_confirm.jsp'">購入</button>
</p>
</form>

<img src="/ShoppingSite/img/duffy_friends2.png">

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>