<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8");	 %>
<%@ page import="org.lxh.mvcdemo.vo.*"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
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
	top: 302px;
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
	height: 353px;
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

#table {
	position: absolute;
	background-color: #F9F9F9;
	font-family: 微软雅黑;
	font-size: 15px;
	font-weight: bold;
}

#student {
	position: absolute;
	left: 20px;
	top: 20px
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
	#b {
		margin: 40px auto;
		font-family: 'trebuchet MS', 'Lucida sans', Arial;
		font-size: 14px;
		color: #444;
	}
	table {
		position: absolute;
		top: 2px;
		*border-collapse: collapse; /* IE7 and lower */
		border-spacing: 0;
		width: 840px;
	}
	.bordered {
		border: solid #ccc 1px;
		-webkit-border-radius: 6px;
		-webkit-box-shadow: 0 1px 1px #ccc;
		box-shadow: 0 1px 1px #ccc;
	}
	.bordered tr:hover {
		background: #fbf8e9;
		-webkit-transition: all 0.1s ease-in-out;
		transition: all 0.1s ease-in-out;
	}
	.bordered td,.bordered th {
		border-left: 1px solid #ccc;
		border-top: 1px solid #ccc;
		padding: 10px;
		text-align: left;
	}
	.bordered th {
		background-color: #dce9f9;
		background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc),
			to(#dce9f9) );
		background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);
		-webkit-box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset;
		box-shadow: 0 1px 0 rgba(255, 255, 255, .8) inset;
		border-top: none;
		text-shadow: 0 1px 0 rgba(255, 255, 255, .5);
	}
	.bordered td:first-child,.bordered th:first-child {
		border-left: none;
	}
	.bordered th:first-child {
		-webkit-border-radius: 6px 0 0 0;
		border-radius: 6px 0 0 0;
	}
	.bordered th:last-child {
		-webkit-border-radius: 0 6px 0 0;
		border-radius: 0 6px 0 0;
	}
	.bordered th:only-child {
		-webkit-border-radius: 6px 6px 0 0;
		border-radius: 6px 6px 0 0;
	}
	.bordered tr:last-child td:first-child {
		-webkit-border-radius: 0 0 0 6px;
		border-radius: 0 0 0 6px;
	}
	.bordered tr:last-child td:last-child {
		-webkit-border-radius: 0 0 6px 0;
		border-radius: 0 0 6px 0;
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
		<li class="colour-1"><a href="Servlet">主页</a>
		</li>
		<li class="colour-2"><a href="add.jsp">添加</a>
		</li>
		<li class="colour-3"><a href="select.jsp">查询</a>
		</li>
	</ul>
	</nav> </header>
	<div id="main">
		<div id="b">
			<table class="bordered" width='50%' border='0' align='center'
				cellpadding='0' cellspacing='1' bgcolor='#F9F9F9'>
				<thead>
					<tr align="center">
						<th>图书编号</th>
						<th>书名</th>
						<th>类型</th>
						<th>作者</th>
						<th>出版社</th>
						<th>价格</th>
						<th>删除</th>
						<th>修改</th>
					</tr>
				</thead>

				<!-- 获取request范围的值,并循环遍历出来 -->
				<c:forEach var="books" items="${requestScope.all}"> 
					<tr align="center">
						<td><c:out value="${books.bookid}" />
						</td>
						<td><c:out value="${books.bookname}" />
						</td>
						<td><c:out value="${books.booktype}" />
						</td>
						<td><c:out value="${books.bookauthor}" />
						</td>
						<td><c:out value="${books.bookisbn}" />
						</td>
						<td><c:out value="${books.bookprice}" />
						</td>
						  <!-- 将获取到bookid的值传递到DelectServlet处理 -->
						<td><c:url var="path" value="DelectServclet" scope="page">
								<c:param name="bookid" value="${books.bookid}" />
							</c:url> <a href="${pageScope.path}">删除</a></td>
						<td>
						<!-- 建立看不见的表单获取遍历出的值，并发送给 update.jsp处理-->
							<form action="update.jsp" method="post">
								<input name="bookid" type="hidden" value="${books.bookid}" /> <input
									name="bookname" type="hidden" value="${books.bookname}">
								<input name="booktype" type="hidden" value="${books.booktype}">
								<input name="bookauthor" type="hidden"
									value="${books.bookauthor}" /> <input name="bookisbn"
									type="hidden" value="${books.bookisbn}"> <input
									name="bookprice" type="hidden" value="${books.bookprice}" /> <input
									type="submit" value="修改">
							</form></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>