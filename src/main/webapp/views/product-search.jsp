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

<p>
	商品一覧 <br>全2種類です
</p>

<form action="/ShoppingSite/searchServlet" method="post">
	<input type="text" name="keyword"> <input type="submit"
		value="検索">
</form>

<c:forEach var="product" items="${list}">
	<p>
		${product.product_id}<br>
		<img src="${product.product_image}" alt="product_image" /><br>
		${product.product_name}<br>
		${product.product_price}円<br>
		${product.product_description}<br>
	</p>
</c:forEach>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<img src="/ShoppingSite/img/duffy_friends2.png">

<%@include file="../footer.html"%>