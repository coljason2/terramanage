<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<jsp:include page="/layout/meta.jsp" />
<title>泰羅訂單系統</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<jsp:include page="/layout/nav.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1>泰羅服飾訂單系統</h1>
			<form method="post" action="/terra/action">
				<table>
					<tr>
						<td><input type="text" name="name" /></td>
						<td><input type="password" name="number" /></td>
						<td><input type="submit" value="Get HTML Page" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="/layout/footer.jsp" />

</body>
</html>