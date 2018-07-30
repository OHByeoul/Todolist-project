<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="import/resources.jsp"%>
<link rel="stylesheet" type="text/css" href="/css/todoLoginPage.css">
<title>TODO login page</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<h1 class="text-center login-title">Sign in to continue to
					TODOlist</h1>
				<div class="account-wall">
					<img class="profile-img"
						src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
						alt="">
					<form class="form-signin" action="/login" method="POST">
						<input type="text" name="id" class="form-control" placeholder="ID" required
							autofocus> <input type="password" name="password" class="form-control"
							placeholder="Password" required>
						<label class="checkbox pull-left"> <input type="checkbox"
							value="remember-me"> Remember me
						</label>
						<button class="btn btn-lg btn-primary btn-block" type="submit">
							로그인</button>
						
						<button type="button" class="btn btn-lg btn-primary btn-block"
							data-toggle="modal" data-target="#signUpModal">회원가입</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="user/signUpModal.jsp"%>
</body>
</html>