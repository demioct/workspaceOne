<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demioct</title>
<style type="text/css">
#title{
	text-align: center;
	font-size: 200%;
	font-style:italic;
}
#left{
	width: 300PX;
	height: 400px;
	float:left;
	margin-left: 50px;
}
#left .say{
	width: 45%;
	height: 400px;
	float:left;
	word-wrap:  break-word;
	word-break: normal;
	font-size: 500%;
	font-style:italic;
}
#img{
	text-align: center;
	float: left;
}
</style>
</head>
<body>
<div id="title" >This is my love !</div>
<br>
<div id="left">
	<div class="say">执子之手</div>
	<div class="say">与子偕老</div>
</div>
<div id="img"><img src="<%=request.getContextPath()%>/static/images/1.jpg"></div>

</body>
</html>