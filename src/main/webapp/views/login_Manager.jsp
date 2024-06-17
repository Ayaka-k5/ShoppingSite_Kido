<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>ログイン(管理者)</h1>

<form action="/ShoppingSite/loginServlet_Manager" method="post">
	<p>メールアドレス</p>
	<input type="email" name="manager_mailaddress" required>
	<p>パスワード</p>
	<input type="password" name="manager_password" required>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<p>or</p>
<p>
	<button type=button onclick="location.href='/ShopptingSite/views/information_Manager.jsp'">新規登録</button>
</p>
<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>