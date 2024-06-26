<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>削除しますか？</h1>

<form action="/ShoppingSite/manageDeleteServlet" method="post">
	<p>
		商品名:
		<%=request.getParameter("product_name")%>
	</p>
	<input type="hidden" name="product_name"
		value="<%=request.getParameter("product_name")%>">

	<p>
		価格:
		<%=request.getParameter("product_price")%>
	</p>
	<input type="hidden" name="product_price"
		value="<%=request.getParameter("product_price")%>">

	<p>
		商品説明:
		<%=request.getParameter("product_description")%>
	</p>
	<input type="hidden" name="product_description"
		value="<%=request.getParameter("product_description")%>">
		<input type="submit" value="削除">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>