<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart Website</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<header>
	  <div class="row">
	   <div class="logo">
		<img src="logo1.jpg">
	   </div>
	  
	   <div class="hero">
		<h1>Electronix Pet</h1>
	</div>
		<ul class="main-nav">
			<li class="active"><a href="home.html">HOME</a></li>
			<li><a href="about.html">ABOUT</a></li>
			<li><a href="login.jsp">LOGIN</a></li>
			<li><a href="registration.jsp">REGISTER</a></li>
			<li><a href="productImage.jsp">PRODUCT</a></li>
			<li><a href="#">PRODUCT</a></li>
		</ul>
		<!-- <div class="hhero">
		<h1>Electronix Pet</h1>
	</div>  -->
	  </div>
	  
	
	<!-- 
		<div class="button">
			<a href="" class="btn btn-one"> Watch Video</a>
			<a href="" class="btn btn-two"> Explore</a>
		</div>
	 -->	
	<!--  <div class="mobile">
		<a href="#"><img src="mobile.jpg" ></a>
		<div class="centered"><h2>Mobile Phones</h2></div>
	   </div> -->

<!-- <h2 class="w3-center">Automatic Slideshow</h2> -->
</header>
<div class="slide">
  <img class="mySlides" src="cart.jpg">
  <img class="mySlides" src="cart.jpg">
  <img class="mySlides" src="bags.jpg">
  <img class="mySlides" src="girlwithbags.jpg">
</div>
<!-- </header> -->
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
</body>
<footer class="foot">
	
	<p>&copy; 2018 ElectronixPet.com</p>
</footer>
</html>
