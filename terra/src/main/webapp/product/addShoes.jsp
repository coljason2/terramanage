<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<jsp:include page="/layout/meta.jsp" />
<title>鞋類產品</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<jsp:include page="/layout/nav.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h2>鞋類產品</h2>
			<form class="form-horizontal" action="">
				<div class="form-group">
					<label for="inputType" class="col-sm-2 control-label">產品型號</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" id="inputType"
							placeholder="產品型號">
					</div>
				</div>
				<div class="form-group">
					<label for="inputSex" class="col-sm-2 control-label">性別</label>
					<div class="col-sm-2">
						<select class="form-control" id="inputSex">
							<option>男</option>
							<option>女</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label for="inputSize" class="col-sm-2 control-label">產品大小</label>
					<div class="col-sm-2">
						<select class="form-control" id="inputSize">
							<option>38(22)</option>
							<option>39(22.5)</option>
							<option>40(23)</option>
							<option>41(23.5)</option>
							<option>42(24)</option>
							<option>43(24.5)</option>
							<option>44(25)</option>
							<option>45(25.5)</option>
							<option>46(26)</option>
							<option>47(26.5)</option>
							<option>48(27)</option>
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