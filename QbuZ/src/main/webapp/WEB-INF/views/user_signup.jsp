<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign up</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Bootstrap/css/bootstrap.css" />


</head>
<body>
	<div class="container">
		<div class="row">			
			<div class="col-md-offset-4 col-md-4">
				<div class="panel panel-default" style="margin-top: 40%">
					<div class="panel-heading">
						<h2 style="text-align: center;">Sign up</h2>
					</div>
					<div class="panel-body">
						<form action="signup" method="post">
							<div class="form-group">
								<label for="email">Name:</label> <input name="userName"
									type="text" class="form-control" id="">
							</div>
							<div class="form-group">
								<label for="email">Email address:</label> <input name="email"
									type="email" class="form-control" id="">
							</div>
							<div class="form-group">
								<label for="email">DOB:</label> <input name="dateOfBirth"
									type="date" class="form-control" id="">
							</div>
							<div class="form-group">
								<label for="pwd">Password:</label> <input name="password"
									type="password" class="form-control" id="">
							</div>
							<div class="form-group" style="margin-top: 40px">
								<button type="submit" class="btn btn-default btn-block btn-lg">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>