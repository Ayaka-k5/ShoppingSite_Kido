<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>ログアウト(管理者)</h1>

<p>ログアウトしますか？</p>

<form action="/ShoppingSite/logoutServlet_Manager" method="post">
	<p>
		<input type="submit" value="ログアウト">
	</p>
</form>
<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>