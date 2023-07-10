<%-- 
    Document   : customer-login
    Created on : Jul 3, 2023, 12:47:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<link rel="stylesheet" href="style.css">
	<link rel="stylesheet" href="style-login.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Customer Login</title>
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
      <% if (request.getAttribute("error") != null) { %>
        <div class="error-box">
            <%= request.getAttribute("error") %>
        </div>
    <% } %>
	<div class="container" id="container">
		<div class="form-container log-in-container">
			<form action="customer" method="post">
				<h1>Login</h1>
				<div class="social-container">
					<a href="#" class="social"><i class="fa fa-facebook fa-2x"></i></a>
					<a href="#" class="social"><i class="fab fa fa-twitter fa-2x"></i></a>
				</div>
				<span>use your account</span>
				<input type="text" placeholder="UserNmae" name="uname" />
				<input type="password" placeholder="Password" name="psw"  />
				<a href="registration.html">Register with us</a>
				<button>Log In</button>
			</form>
		</div>
		<div class="overlay-container">
			<div class="overlay">
				<div class="overlay-panel overlay-right">
					<h1>Hello User!</h1>
					<p>Enter your personal details & start your journey with us.</p>
					
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>
