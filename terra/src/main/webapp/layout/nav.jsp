<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand"
				href="<%=request.getContextPath()%>/index.jsp">泰羅訂單系統</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">客戶 <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li><a
							href="<%=request.getContextPath()%>/customer/addCustomer.jsp">新增客戶</a></li>
						<li><a
							href="<%=request.getContextPath()%>/customer/mCust.jsp">管理客戶</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">商品 <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li><a
							href="<%=request.getContextPath()%>/product/addProduct.jsp">服飾商品</a></li>
						<li><a
							href="<%=request.getContextPath()%>/product/addShoes.jsp">鞋類商品</a></li>
						<li><a
							href="<%=request.getContextPath()%>/product/mProduct.jsp">管理商品</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">訂單 <span
						class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
						<li><a
							href="<%=request.getContextPath()%>/order/addOrder.jsp">新增訂單</a></li>
						<li><a href="<%=request.getContextPath()%>/order/mOrder.jsp">管理訂單</a></li>
					</ul></li>
				<li><a href="<%=request.getContextPath()%>/layout/about.jsp">關於</a></li>


			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>