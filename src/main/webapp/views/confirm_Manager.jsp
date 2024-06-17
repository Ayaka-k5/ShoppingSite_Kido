<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>以下の情報でよろしいですか？</h1>

<form action="/ShoppingSite/informationServlet_Manager" method="post">
	<p>
		メールアドレス:
		<%=request.getParameter("manager_mailaddress")%>
	</p>
	<input type="hidden" name="manager_mailaddress"
		value="<%=request.getParameter("manager_mailaddress")%>">

	<p>
		パスワード:
		<%=request.getParameter("manager_password")%>
	</p>
	<input type="hidden" name="manager_password"
		value="<%=request.getParameter("manager_password")%>">

	<p>
		姓:
		<%=request.getParameter("manager_lastname")%>
	</p>
	<input type="hidden" name="manager_lastname"
		value="<%=request.getParameter("manager_lastname")%>">

	<p>
		名:
		<%=request.getParameter("manager_firstname")%>
	</p>
	<input type="hidden" name="manager_firstname"
		value="<%=request.getParameter("manager_firstname")%>">

	<p>
		<input type="submit" value="登録">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>