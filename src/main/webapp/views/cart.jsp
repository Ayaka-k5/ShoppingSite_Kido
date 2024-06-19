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
			<li><a href="#">カート</a></li>
		</ul>
	</nav>
</header>
<h1>Hug Me</h1>

<form action="buy" method="post">
<c:forEach var="product" items="${list}">
	<p>
		${product.product_id}<br>
		<img src="${product.product_image}" alt="product_image" /><br>
		${product.product_name}<br>
		${product.product_price}円<br>
		number+"個"<br>
	</p>
</c:forEach>
<input type="submit" value="購入">
</form>

<img src="/ShoppingSite/img/duffy_friends2.png">

<%@include file="../footer.html"%>