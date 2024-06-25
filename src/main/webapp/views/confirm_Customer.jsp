<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/information_customer.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="informationCustomer">
	<h1>以下の情報でよろしいですか？</h1>
	
	<form action="/ShoppingSite/informationServlet_Customer" method="post">
		<p>
			メールアドレス:
			<%=request.getParameter("customer_mailaddress")%>
		</p>
		<input type="hidden" name="customer_mailaddress"
			value="<%=request.getParameter("customer_mailaddress")%>">
	
		<p>
			パスワード:
			<%=request.getParameter("customer_password")%>
		</p>
		<input type="hidden" name="customer_password"
			value="<%=request.getParameter("customer_password")%>">
	
		<p>
			姓:
			<%=request.getParameter("customer_lastname")%>
		</p>
		<input type="hidden" name="customer_lastname"
			value="<%=request.getParameter("customer_lastname")%>">
	
		<p>
			名:
			<%=request.getParameter("customer_firstname")%>
		</p>
		<input type="hidden" name="customer_firstname"
			value="<%=request.getParameter("customer_firstname")%>">
	
		<p>
			電話番号:
			<%=request.getParameter("customer_telephone")%>
		</p>
		<input type="hidden" name="customer_telephone"
			value="<%=request.getParameter("customer_telephone")%>">
	
		<p>
			住所:
			<%=request.getParameter("customer_address")%>
		</p>
		<input type="hidden" name="customer_address"
			value="<%=request.getParameter("customer_address")%>">
	
		<p>
			<input class="informationButton" type="submit" value="登録">
		</p>
	</form>
	
	<p>
		<button class="informationButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>