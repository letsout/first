<%@ page contentType="text/html" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>管理员登录</title>
<script type="text/javascript">
    function H(){
    	if(form.userid.value=="")
    	    	{alert("请输入内容"); 
    	        form.userid.focus(); 
    	        return false; 
    	    	}
    	if(form.userpass.value=="")
    	{alert("图书名称不能为空，请重新输入"); 
        form.userpass.focus(); 
        return false; 
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
	height: 300px;
	position: absolute;
	left: 183px
}

header {
	position: relative;
	top: 285px;
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
	height: 476px;
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
	left: 260px;
	top: 90px;
	font-family: 微软雅黑;
	font-size: 20px;
	font-weight: bold;
}

#student {
	position: absolute;
	left: 20px;
	top: 20px
}

#left {
	position: absolute;
	left: 183px;
	top: 300px;
	height: 475px;
	width: 220px;
	background-color: #28AADC;
}

#lpic {
	position: absolute;
	width: 200px;
	height: 400px;
	top: 50px;
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
	<div id="left">
		<img id="lpic" src="images/left.png">
	</div>

	<div id="main">
	               <!-- 建立表单将数据发送到LoginServlet处理 -->
		<img id="student" src="images/stutent.png">
		<form action="LoginServlet" method="post" name="form">
			<br> <br> <br> <br> <br>
			<center>
				用户ID：<input type="text" name="userid">
			</center>
			<br>
			<center>
				密&nbsp;&nbsp;&nbsp;码：<input type="password" name="userpass">
			</center>
			<br>
			<center>
				<input type="submit" value="登陆"> <input type="reset"
					value="重置">
			</center>
		</form>
	</div>
</body>
</html>