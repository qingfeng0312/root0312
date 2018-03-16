<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update_stu.jsp' starting page</title>
    
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
  <!-- 得用ajax做 --> 
   <form action="stu/updateStu.do" method="post">
   <input type="hidden" name="stuId" value="${stu.stuId}">
    姓名:<input type="text" name="stuName" value="${stu.stuName}">
    性别:<input type="text" name="stuSex" value="${stu.stuSex}">
     年龄:<input type="text" name="stuAge" value="${stu.stuAge}">
    地址:<input type="text" name="stuAddress" value="${stu.stuAddress}">
    电话号码:<input type="text" name="stuPhone" value="${stu.stuPhone}">
    <input type="submit" value="保存修改">
    </form>
  </body>
</html>
