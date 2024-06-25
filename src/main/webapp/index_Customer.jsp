<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/index_customer.css" rel="stylesheet">
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

<div class="indexCustomer">
	<h1>Hug Me</h1>

	<img class="mainImage" src="img/duffy_friends1.png">

	<p>
		ダッフィーフレンズのぬいぐるみを販売しているサイトです。
	</p>
</div>

<%@include file="../footer.html"%>