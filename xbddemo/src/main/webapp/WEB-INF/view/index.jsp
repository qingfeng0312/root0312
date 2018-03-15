<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商品展示</title>
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
    <table border="1" height="100%" width="100%">
    <tr height="15%"><td colspan="2"><img src=""></td></tr>
    <tr><td width="15%"><a href="stu/add.do" target="main">用户添加</a><br>
    <a href="stu/stuSelect.do" target="main">用户查询</a><br>
    <!-- <a href="stu/upload.do" target="main">上传</a>  -->
    </td><td><iframe name="main" width="100%" height="100%"></iframe></td></tr>
    </table>
  </body>
</html>
  