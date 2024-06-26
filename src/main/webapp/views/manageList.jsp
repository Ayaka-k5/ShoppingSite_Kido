<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/product.css" rel="stylesheet">
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../header.html"%>

<header>
	<nav>
		<ul>
			<li><a href="/ShoppingSite/index_Manager.jsp">Hug Me</a></li>
			<li><a href="/ShoppingSite/views/manageA.jsp">商品管理</a></li>
			<li><a href="/ShoppingSite/views/login-choice.jsp">ログイン/新規登録</a></li>
			<li><a href="/ShoppingSite/views/logout_Manager.jsp">ログアウト</a></li>
	</nav>
</header>

<div class="productCustomer">
	<h1>Hug Me</h1>

	<h1>商品管理</h1>

	<p>
		<button class="productButton" type=button
			onclick="location.href='/ShoppingSite/views/manage.jsp'">登録</button>
	</p>
</div>

<c:forEach var="manage" items="${manageList}">
	<div class="productCustomer">
		<form action="/ShoppingSite/manageDeleteConfirmServlet" method="post">
			<p>
				<img class="productImage" src="/ShoppingSite/img/${manage.product_id}.jpg"
					alt="product_image" /><br>
				${manage.product_name}<br>
				${manage.product_price}円（税抜き）<br>
				${manage.product_description}<br>
				<input type="hidden" name="product_id" value="${manage.product_id}">
				<input type="hidden" name="product_name" value="${manage.product_name}">
				<input type="hidden" name="product_price" value="${manage.product_price}">
				<input type="hidden" name="product_description" value="${manage.product_description}">
				<input class="productButton" type="submit" value="削除">
			</p>
		</form>
	</div>
</c:forEach>

<div class="productCustomer">
	<p>
		<button class="productButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>