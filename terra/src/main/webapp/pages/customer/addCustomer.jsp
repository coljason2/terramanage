<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<jsp:include page="/layout/meta.jsp" />
<title>新增客戶</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<jsp:include page="/layout/nav.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h2>新增客戶</h2>
			<form class="form-horizontal" action="">
				<div class="form-group">
					<label for="inputName" class="col-sm-2 control-label">客戶名稱</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="inputName"
							placeholder="客戶名稱">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPhone" class="col-sm-2 control-label">客戶電話</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="inputPhone"
							placeholder="客戶電話">
					</div>
				</div>
				<div class="form-group">
					<label for="inputID" class="col-sm-2 control-label">客戶ID</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="inputID"
							placeholder="客戶ID">
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail" class="col-sm-2 control-label">客戶EMAIL</label>
					<div class="col-sm-3">
						<input type="email" class="form-control" id="inputEmail"
							placeholder="客戶EMAIL">
					</div>
				</div>
				<div class="form-group">
					<label for="inputAddr" class="col-sm-2 control-label">客戶住址</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="inputAddr"
							placeholder="客戶住址">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPhoneuser" class="col-sm-2 control-label">電話聯絡人</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="inputPhoneuser"
							placeholder="電話聯絡人">
					</div>
				</div>
				<div class="form-group">
					<label for="inputRemark" class="col-sm-2 control-label">備註</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="inputRemark"
							placeholder="備註">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-3">
						<button type="submit" class="btn btn-primary">新增</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<jsp:include page="/layout/footer.jsp" />

</body>
</html>