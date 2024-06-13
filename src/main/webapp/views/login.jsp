<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<p>ログイン</p>

<form action="/ShoppingSite/loginServlet" method="post">
	<p>メールアドレス</p>
	<input type="email" name="customer_mailaddress" required>
	<p>パスワード</p>
	<input type="password" name="customer_password" required>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<p>
	or<br>
	<button type=button onclick="location.href='./login-error.jsp'">新規登録</button>
</p>
<p>
<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>