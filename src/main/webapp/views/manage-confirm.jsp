<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h1>登録しますか？</h1>

<form action="/ShoppingSite/manageServlet" method="post">
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

	<p>
		在庫:
		<%=request.getParameter("product_stock")%>
	</p>
	<input type="hidden" name="product_stock"
		value="<%=request.getParameter("product_stock")%>">

	<p>
		<input type="submit" value="登録">
	</p>
</form>

<p>
	<button type="button" onclick="history.back()">戻る</button>
</p>

<%@include file="../footer.html"%>