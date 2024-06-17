<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>会員情報登録(管理者)</h1>

<form action="/ShoppingSite/confirmServlet_Manager" method="post">
	<p>メールアドレス</p>
	<input type="email" name="manager_mailaddress" required>

	<p>パスワード</p>
	<input type="password" name="manager_password" required>

	<p>姓</p>
	<input type="text" name="manager_lastname" required>

	<p>名</p>
	<input type="text" name="manager_firstname" required>

	<p>
		<input type="submit" value="登録">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>