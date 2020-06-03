<%--
  Created by IntelliJ IDEA.
  User: 刘远鹏
  Date: 2020/5/30
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能页面</title>
</head>
<body>
<div>
    学生信息管理
</div>
<div>
    <a href="login.jsp">注销</a>
</div>
<div>
    <span>管理成绩</span></br>

    <a href="/startQuery">查询成绩</a></br>
    <a href="addStudent.jsp">添加成绩</a>
</div>
<div>
    <span>查找成绩 <input type="text" name="query" id="query" />
        <select name="cars">

　　<option value="city">查找全部</option>

        　　<option value="hefei">学生姓名</option>

        　　<option value="wuhu">学生学号</option>

        　　</select>
        <input type="submit" name="querybtn" id="querybtn" value="查询" />
    </span>

</div>
<div>
    <table width="800" border="0" cellspacing="0" cellpadding="0">
        <tr bgcolor="#EBE7DC">
            <td>编号</td>
            <td>学号</td>
            <td>姓名</td>
            <td>科目</td>
            <td>平时分</td>
            <td>考试分</td>
            <td>总分</td>
            <td>编辑</td>

            <td>&nbsp;</td>
        </tr>
        <tr bgcolor="#FAF3E9">
            <td><input type="checkbox" /></td>
            <td>张三</td>
            <td>男</td>
            <td>6565654315321321</td>
            <td>短工</td>
            <td>18625455412</td>
            <td>1995-12-09</td>

            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
            </td>
        </tr>
        <tr bgcolor="#FEFAF7">
            <td><input type="checkbox" /></td>
            <td>张三</td>
            <td>男</td>
            <td>6565654315321321</td>
            <td>短工</td>
            <td>18625455412</td>
            <td>1995-12-09</td>

            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
            </td>
        </tr>
        <tr bgcolor="#FAF3E9">
            <td><input type="checkbox" /></td>
            <td>张三</td>
            <td>男</td>
            <td>6565654315321321</td>
            <td>短工</td>
            <td>18625455412</td>
            <td>1995-12-09</td>

            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
            </td>
        </tr>
    </table>
</div>

<a href="zengshangai.jsp">返回</a>
</body>
</html>
