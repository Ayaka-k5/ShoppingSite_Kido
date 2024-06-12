<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<form action="/Login/loginServlet" method="post">
	<p>
		ユーザーID<input type="text" name="username">
	</p>
	<p>
		パスワード<input type="password" name="password">
	</p>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<%@include file="../footer.html"%>