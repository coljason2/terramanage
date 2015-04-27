<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="/layout/meta.jsp" />
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/layout/nav.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1>${message}</h1>
			<p>${name}</p>
			<p>${number}</p>
		</div>
	</div>
	<jsp:include page="/layout/footer.jsp" />
</body>
</html>