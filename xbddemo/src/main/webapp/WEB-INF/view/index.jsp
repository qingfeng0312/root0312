<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
<body>
<table width="100%"  height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="561" style="background:url(<%=basePath%>pstatic/images/lbg.gif)"><table width="940" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td height="238" style="background:url(<%=basePath%>pstatic/images/login01.jpg)">&nbsp;</td>
          </tr>
          <tr>
            <td height="190"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="208" height="190" style="background:url(<%=basePath%>pstatic/images/login02.jpg)">&nbsp;</td>
                <td width="518" style="background:url(<%=basePath%>pstatic/images/login03.jpg)"><table width="320" border="0" align="center" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="40" height="50"><img src="<%=basePath%>pstatic/images/user.gif" width="30" height="30"></td>
                    <td width="38" height="50">用户</td>
                    <td width="242" height="50"><input type="text" name="textfield" id="textfield" style="width:164px; height:32px; line-height:34px; background:url(<%=basePath%>pstatic/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; font-family:Verdana, Geneva, sans-serif;"></td>
                  </tr>
                  <tr>
                    <td height="50"><img src="<%=basePath%>pstatic/images/password.gif" width="28" height="32"></td>
                    <td height="50">密码</td>
                    <td height="50"><input type="password" name="textfield2" id="textfield2" style="width:164px; height:32px; line-height:34px; background:url(<%=basePath%>pstatic/images/inputbg.gif) repeat-x; border:solid 1px #d1d1d1; font-size:9pt; "></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td height="40">&nbsp;</td>
                    <td height="60"><img src="<%=basePath%>pstatic/images/login.gif" width="95" height="34"></td>
                  </tr>
                </table></td>
                <td width="214" style="background:url(<%=basePath%>pstatic/images/login04.jpg)" >&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="133" style="background:url(<%=basePath%>pstatic/images/login05.jpg)">&nbsp;</td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
  