<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<%
  String path = request.getContextPath();
  String basePath =
      request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
          + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'show_stu.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table border="1" id="tb">
		<tr height="40px;" align="center">
			<td width="100px;">编号</td>
			<td width="100px;">姓名</td>
			<td width="100px;">性别</td>
			<td width="100px;">年龄</td>
			<td width="100px;">地址</td>
			<td width="100px;">电话号码</td>
			<td width="100px;">删除</td>
			<td width="100px;">修改</td>
		</tr>
		<jstl:forEach items="${list}" var="stu">
			<tr height="40px;" align="center">
				<td>${stu.stuId}</td>
				<td>${stu.stuName}</td>
				<td>${stu.stuSex}</td>
				<td>${stu.stuAge}</td>
				<td>${stu.stuAddress}</td>
				<td>${stu.stuPhone}</td>
				<td><a href="stu/delete.do?stuId=${stu.stuId}">删除</a>
				</td>
				<td><a href="stu/selectOne.do?stuId=${stu.stuId}">修改</a>
				</td>
			</tr>
			<br>
		</jstl:forEach>
	</table>
</body>
</html>
