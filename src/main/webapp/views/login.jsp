<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<p>ログイン</p>

<form action="/ShoppingSite/loginServlet" method="post">
	<p>メールアドレス</p>
	<input type="email" name="customer_mailaddress" required>
	<%-- <p>パスワード</p>
	<input type="password" name="password" required> --%>
	<p>
		<input type="submit" value="ログイン">
	</p>
</form>

<p>
	or<br>
	<button onclick="location.href='./login-error.jsp'">新規登録</button>
</p>

<%@include file="../footer.html"%>