<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SHOP EASY !</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <!--   Dropdown for mens category -->
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Men <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Clothes</a></li>
          <li><a href="#">Accessories</a></li>
        </ul>
      </li>
  
  <!-- Dropdown for women category -->
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Women <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Clothes</a></li>
          <li><a href="#">Accessories</a></li>
        </ul>
      </li>
  
<!--   Dropdown for kids category -->
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Kids <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Clothes</a></li>
          <li><a href="#">Toys</a></li>
        </ul>
      </li>
  
      <!-- <li><a href="#">Women</a></li>
      <li><a href="#">Kids</a></li> -->
    
    
    </ul>
  </div>
</nav>
</body>
</html>
