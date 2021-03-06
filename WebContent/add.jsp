<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书添加</title>
<script language="JavaScript"> 
	function H(){
	if(form.bookid.value=="")
	    	{alert("请输入内容"); 
	        form.bookid.focus(); 
	        return false; 
	    	}
	if(form.bookname.value=="")
	{alert("图书名称不能为空，请重新输入"); 
    form.bookname.focus(); 
    return false; 
	}
	if(form.booktype.value=="")
	{alert("图书类型不能为空，请重新输入"); 
    form.booktype.focus(); 
    return false; 
	}
	if(form.bookprice.value=="")
	{alert("图书价格不能为空，请重新输入"); 
    form.bookprice.focus(); 
    return false; 
	}
	if(form.bookisbn.value=="")
	{alert("出版社不能为空，请重新输入"); 
    form.bookisbn.focus(); 
    return false; 
	}
	if(form.bookauthor.value=="")
	{alert("图书作者不能为空，请重新输入"); 
    form.book.author.focus(); 
    return false; 
	}
	    	}
</script>

<style>
body {
	margin: 0px;
}

a {
	text-decoration: none;
}

#top {
	width: 1000px;
	height: 305px;
	position: absolute;
	left: 183px
}

header {
	position: relative;
	top: 300px;
	left: 163px;
}

#school {
	width: 260px;
	height: 70px;
	position: absolute;
	top: 242px;
	left: 930px;
}

#main {
	width: 838px;
	height: 358px;
	position: absolute;
	left: 346px;
	top: 300px;
	background-color: #F9F9F9
}

#tile {
	width: 160px;
	height: 50px;
	position: absolute;
	left: 350px;
	top: 420px
}

form {
	position: absolute;
	left: 150px;
	top: 90px;
	font-family: 微软雅黑;
	font-size: 20px;
	font-weight: bold;
}

#add {
	position: absolute;
	left: 250px;
	top: 220px;
}

.clearfix {
	position: relative;
	left: -20px;
	top: -19px;
}

nav.cmn-tile-nav li {
	display: block;
	overflow: hidden;
	font-family: "Oswald", "Helvetica Neue", Helvetica, Arial,
		"Lucida Grande", sans-serif;
	text-shadow: -1px 1px rgba(0, 0, 0, 0.3);
	transition: background 0.3s;
} /* 字体样式*/
nav.cmn-tile-nav a {
	display: block;
	padding: 20px;
	color: #fff;
	font-weight: bold;
	transition: background 0.3s, transform 0.3s;
} /* 样式*/
nav.cmn-tile-nav li.colour-1 {
	background-color: #28aadc;
}

nav.cmn-tile-nav li.colour-1 a {
	background-color: #28aadc;
}

nav.cmn-tile-nav li.colour-1:hover,nav.cmn-tile-nav li.colour-1:hover a
	{
	background-color: #166888;
}

nav.cmn-tile-nav li.colour-2 {
	background-color: #0a8cbe;
}

nav.cmn-tile-nav li.colour-2 a {
	background-color: #0a8cbe;
}

nav.cmn-tile-nav li.colour-2:hover,nav.cmn-tile-nav li.colour-2:hover a
	{
	background-color: #05455d;
}

nav.cmn-tile-nav li.colour-3 {
	background-color: #006ea0;
}

nav.cmn-tile-nav li.colour-3 a {
	background-color: #006ea0;
}

nav.cmn-tile-nav li.colour-3:hover,nav.cmn-tile-nav li.colour-3:hover a
	{
	background-color: #00283a;
}

nav.cmn-tile-nav li.colour-4 {
	background-color: #006478;
}

nav.cmn-tile-nav li.colour-4 a {
	background-color: #006478;
}

nav.cmn-tile-nav li.colour-4:hover,nav.cmn-tile-nav li.colour-4:hover a
	{
	background-color: #000f12;
}
/* smoother transitions */
nav.cmn-tile-nav a {
	transform: translate3d(0, 0, 0); /*显示出来！！！！*/
}

/* media queries */
@media all and (min-width: 480px) {
	nav.cmn-tile-nav {
		display: block; /*显示出来！！！！*/
	}
	nav.cmn-tile-nav li {
		width: 50%;
	}
}

@media all and (min-width: 768px) {
	nav.cmn-tile-nav li {
		width: 26%;
	}
	nav.cmn-tile-nav a {
		text-align: center;
		padding: 60px 20px 20px 20px;
	}
}

@media all and (min-width: 1024px) {
	nav.cmn-tile-nav li {
		overflow: visible;
		width: 12.5%;
	}
	nav.cmn-tile-nav a {
		padding: 80px 20px 20px 20px;
	}
	nav.cmn-tile-nav a:hover {
		transform: translateY(20px);
	}
}
</style>
</head>
<body>
	<div>
		<img id="top" src="images/top.jpg">
	</div>
	<div>
		<img id="school" src="images/1.png">
	</div>
	<div>
		<img>
	</div>
	<header> <nav class="cmn-tile-nav">
	<ul class="clearfix">
		<li class="colour-1"><a href="Servlet">主页</a></li>
		<li class="colour-2"><a href="add.jsp">添加</a></li>
		<li class="colour-3"><a href="select.jsp">查询</a></li>
	</ul>
	</nav> </header>
	<div id="main">
		<form action="AddServlet" method="post" name="form"
			onsubmit="return H()">
			图书编号:<input type="text" name="bookid">&nbsp;&nbsp;图书名称:<input
				type="text" name="bookname"><br> <br> 图书类型:<input
				type="text" name="booktype"> &nbsp;&nbsp;图书作者:<input
				type="text" name="bookauthor"><br> <br>
			出&nbsp;版&nbsp;社&nbsp;:<input type="text" name="bookisbn">&nbsp;&nbsp;图书价格:<input
				type="text" name="bookprice"><br> <br> <input
				id="add" type="submit" value="添加">
		</form>
	</div>

</body>
</body>
</html>