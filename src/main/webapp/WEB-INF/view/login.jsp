<%@ page contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="utf-8">  
<title>用户登录界面</title>  
</head>  
<body>  
    <form action="${pageContext.request.contextPath}/user/userlogin.do" style="text-align: center; margin: 80px auto; width: 500px;">  
        <p>用户名:<input type="text" name="admin" /></p>  
        <p>密码:<input type="password" name="password" /></p>  
        <input type="submit" value="登录"/>  
    </form>  
</body>  
</html>