<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<jsp:include page="/layout/meta.jsp" />
<title>服飾產品</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<jsp:include page="/layout/nav.jsp" />
	<div class="container theme-showcase" role="main">
		<div class="jumbotron">
			<div class="container">
				<h2>服飾產品</h2>
				<form class="form-horizontal" action="">
					<div class="form-group">
						<label for="inputName" class="col-sm-2 control-label">產品名稱</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" id="inputName"
								placeholder="產品名稱">
						</div>
					</div>
					<div class="form-group">
						<label for="inputType" class="col-sm-2 control-label">產品型號</label>
						<div class="col-sm-3">
							<input type="text" class="form-control" id="inputType"
								placeholder="產品型號">
						</div>
					</div>
					<div class="form-group">
						<label for="inputColor" class="col-sm-2 control-label">產品顏色</label>
						<div class="col-sm-2">
							<input type="text" class="form-control" id="inputColor"
								placeholder="產品顏色">
						</div>
					</div>
					<div class="form-group">
						<label for="inputSize" class="col-sm-2 control-label">產品大小</label>
						<div class="col-sm-2">
							<select class="form-control" id="inputSize">
								<option>XS</option>
								<option>S</option>
								<option>M</option>
								<option>L</option>
								<option>XL</option>
								<option>2XL</option>
								<option>3XL</option>
								<option>4XL</option>
								<option>5XL</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="inputPrice" class="col-sm-2 control-label">產品價格</label>
						<div class="col-sm-2">
							<input type="text" class="form-control" id="inputPrice"
								placeholder="產品價格">
						</div>
					</div>
					<div class="form-group">
						<label for="inputNumber" class="col-sm-2 control-label">產品數量</label>
						<div class="col-sm-2">
							<input type="text" class="form-control" id="inputNumber"
								placeholder="產品數量">
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
	</div>
	<jsp:include page="/layout/footer.jsp" />

</body>
</html>