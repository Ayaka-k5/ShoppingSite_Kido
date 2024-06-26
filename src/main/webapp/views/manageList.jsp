<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="../header.html"%>

<header>
	<nav>
		<ul>
			<li><a href="/ShoppingSite/index_Manager.jsp">Hug Me</a></li>
			<li><a href="/ShoppingSite/views/manageA.jsp">商品管理</a></li>
			<li><a href="/ShoppingSite/views/login_Manager.jsp">ログイン/新規登録</a></li>
			<li><a href="/ShoppingSite/views/logout_Manager.jsp">ログアウト</a></li>
	</nav>
</header>

<h1>Hug Me</h1>

<h1>商品管理</h1>

<p>
	<button type=button
		onclick="location.href='/ShoppingSite/views/manage.jsp'">登録</button>
</p>

<c:forEach var="manage" items="${manageList}">
	<form action="/ShoppingSite/manageDeleteConfirmServlet" method="post">
		<p>
			<img src="/ShoppingSite/img/${manage.product_id}.jpg" alt="product_image" /><br>
			${manage.product_name}<br>
			${manage.product_price}円（税抜き）<br>
			${manage.product_description}<br>
			<input type="hidden" name="product_id" value="${manage.product_id}">
			<input type="hidden" name="product_name" value="${manage.product_name}">
			<input type="hidden" name="product_price" value="${manage.product_price}">
			<input type="hidden" name="product_description" value="${manage.product_description}">
			<input type="submit" value="削除">
		</p>
	</form>
</c:forEach>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>