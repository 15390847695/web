<%--
  Created by IntelliJ IDEA.
  User: 刘远鹏
  Date: 2020/5/29
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form action="/addStudent" method="get">
    学号：<input type="text" name="stuId" id="stuId"/></br>
    姓名：<input type="text" name="CourseId" id="CourseId"/></br>
    年龄：<input type="text" name="Score" id="Score"/></br>
    性别：<input type="text" name="sex" id="sex"/></br>

    <input type="submit" value="添加"/>
</form>

</body>
</html>
