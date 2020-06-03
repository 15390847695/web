<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false" language="java" %>
<html>
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<%--<script src="js/login.js"></script>--%>
<body>
<div >
    <h2>登录</h2>
  <form action="/startQuery" method="get">
        <div>
            账号：<input type="text" name="username" id="username" />
        </div>
        <div>
            密码：<input type="password" name="password" id="password" />
        </div>

        <input type="submit" value="登录" onclick="login()"/>
        <div id="div1">${errMsg}</div>
 </form>

</div>

</body>
</html>
