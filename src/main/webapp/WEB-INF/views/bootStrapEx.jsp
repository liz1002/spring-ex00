<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
	.nav, .navbar-form{
		float: right;
	}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">Project Name</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Home</a></li>
	      <li><a href="#">Page 1</a></li>
	      <li><a href="#">Page 2</a></li>
	      <li><a href="#">Page 3</a></li>
	      <li><a href="#">Page 4</a></li>
	      <li><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 5<span class="caret"></span></a>
	      	<ul class="dropdown-menu">
	          <li><a href="#">Page 1-1</a></li>
	          <li><a href="#">Page 1-2</a></li>
	          <li><a href="#">Page 1-3</a></li>
	        </ul>
	      </li>
	    </ul>
	    <form class="navbar-form navbar-left" action="/action_page.php">
	      <div class="input-group">
	        <input type="text" class="form-control" placeholder="Search" name="search">
	        <div class="input-group-btn">
	          <button class="btn btn-default" type="submit">
	            <i class="glyphicon glyphicon-search"></i>
	          </button>
	        </div>
	      </div>
	    </form>
	  </div>
	</nav>
	<div class="container-fluid">
	  <div class="row">
	    <div class="col-sm-2">
			<ul class="nav">
				<li><a href="#">menu 1</a></li>
				<li><a href="#">menu 2</a></li>
				<li><a href="#">menu 3</a></li>
				<li><a href="#">menu 4</a></li>
			</ul>
		</div>
	    <div class="col-sm-10" style="background-color:lavenderblush;">
		  <table class="table table-striped">
		    <thead>
		      <tr>
		        <th>Firstname</th>
		        <th>Lastname</th>
		        <th>Email</th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <td>John</td>
		        <td>Doe</td>
		        <td>john@example.com</td>
		      </tr>
		      <tr>
		        <td>Mary</td>
		        <td>Moe</td>
		        <td>mary@example.com</td>
		      </tr>
		      <tr>
		        <td>July</td>
		        <td>Dooley</td>
		        <td>july@example.com</td>
		      </tr>
		    </tbody>
		  </table>
		</div>
	  </div>
	</div>
</body>
</html>