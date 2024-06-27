<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<link href="/ShoppingSite/css/product.css" rel="stylesheet">
<%@include file="../header.html"%>

<div class="productCustomer">
	<h1>削除しますか？</h1>

	<form action="/ShoppingSite/manageDeleteServlet" method="post">
		<p>
			<img class="productImage" src="/ShoppingSite/img/<%=request.getParameter("product_id")%>.jpg"
				alt="product_image" />
		</p>
		<input type="hidden" name="product_id"
			value="<%=request.getParameter("product_id")%>">

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
			<input class="productButton" type="submit" value="削除">
		</p>
	</form>

	<p>
		<button class="productButton" type="button" onclick="history.back()">戻る</button>
	</p>
</div>

<%@include file="../footer.html"%>