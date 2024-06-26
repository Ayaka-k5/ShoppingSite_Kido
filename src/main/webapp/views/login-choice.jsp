<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/index_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="indexCustomer">
	<h1>ログイン</h1>

	<p>
		<button class="indexButton"
			onclick="location.href='./login_Customer.jsp'">お客様</button>
		<button class="indexButton"
			onclick="location.href='./login_Manager.jsp'">管理者</button>
	</p>
	
	<p>
		<button class="backButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>