<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession;"%>
<%@include file="../css/style.css"%>
<%@include file="../header.html"%>

<header>
	<nav>
		<ul>
			<li><a href="../index_Customer.jsp">Hug Me</a></li>
			<li><a href="/ShoppingSite/views/product.jsp">商品一覧</a></li>
			<li><a href="/ShoppingSite/views/login_Customer.jsp">ログイン/新規登録</a></li>
			<li><a href="/ShoppingSite/views/logout_Customer.jsp">ログアウト</a></li>
			<li><a href="#">カート</a></li>
		</ul>
	</nav>
</header>
<h1>Hug Me</h1>

<p>
	商品一覧 <br>全2種類です
</p>
<%
HttpSession session = request.getSession();
String product_image = (String) session.getAttribute("product_image");

if (product_image != null) {
%>
<img src="<%=product_image%>" alt="product_image" />
<%
} else {
%>
<p>Error: Product image not found.</p>
<%
}
%>

<img src="../img/duffy_friends2.png">

<%@include file="../footer.html"%>