<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/information_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="informationCustomer">
	<h1>会員情報登録(管理者)</h1>

	<form action="/ShoppingSite/confirmServlet_Manager" method="post">
		<p>メールアドレス</p>
		<input class="form" type="email" name="manager_mailaddress" required>

		<p>パスワード</p>
		<input class="form" type="password" name="manager_password" required>

		<p>姓</p>
		<input class="form" type="text" name="manager_lastname" required>

		<p>名</p>
		<input class="form" type="text" name="manager_firstname" required>

		<p>
			<input class="informationButton" type="submit" value="登録">
		</p>
	</form>

	<p>
		<button class="informationButton" type="button"
			onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>