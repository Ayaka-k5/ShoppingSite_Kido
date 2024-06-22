<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../css/style.css"%>
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

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>