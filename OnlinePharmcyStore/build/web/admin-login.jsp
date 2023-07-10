<%-- 
    Document   : admin-login
    Created on : Jul 3, 2023, 12:17:07 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="style.css">
	<link rel="stylesheet" href="style-login.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Login Form Using HTML And CSS Only</title>
        <style>
        .error-box {
            background-color: #f8d7da;
            color: #721c24;
            padding: 10px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
     <%-- Check if an error message is present --%>
    <% if (request.getAttribute("error") != null) { %>
        <div class="error-box">
            <%= request.getAttribute("error") %>
        </div>
    <% } %>
	<div class="container" id="container">
		<div class="form-container log-in-container">
                    <form action="admin" method="post">
				<h1>Login</h1>
				<div class="social-container">
					<a href="#" class="social"><i class="fa fa-facebook fa-2x"></i></a>
					<a href="#" class="social"><i class="fab fa fa-twitter fa-2x"></i></a>
				</div>
				<span>or use your account</span>
				<input type="email" placeholder="Email" name="uname"/>
				<input type="password" placeholder="Password" name="psw" />
				<a href="#">Forgot your password?</a>
				<button>Log In</button>
			</form>
		</div>
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-right">
					<h1>Hello User!</h1>
					<p>Enter your personal details & start your journey with us.</p>
					<img src="adminlog.jpg" alt="">
				</div>
			</div>
		</div>
	</div>
</body>
</html>
