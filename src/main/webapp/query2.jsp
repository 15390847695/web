<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"
         import="com.hzit.bean.Score"
         import="java.util.List"


%>
<html>
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



     <span>
         <form action="/query" method="get">

         查找成绩 <input type="text" name="query" id="query" />
    <select name="cars">

        　　<option value="all" name="all">查找全部</option>

        　　<option value="stuname" name="stuname">学生姓名</option>

        　　<option value="id" name="id">学生学号</option>

        　　</select>


        <input type="submit" name="querybtn" id="querybtn" value="查询" />
              </form>
    </span>

</div>

<%

    List<Score> list = (List<Score>)request.getAttribute("list");

%>

<table   border="1px" cellspacing="0" cellpadding="5px">
    <tr>
        <td>学生id</td>
        <td>学生姓名</td>
        <td>学生年龄</td>
        <td>学生性别</td>
    <tr>
            <%
	for(int i = 0 ;i<list.size();i++){
		Score s =list.get(i);

%>

    <tr>
        <td><%=s.getStuId()%></td>
        <td><%=s.getStuName()%></td>
        <td><%=s.getStuAge()%></td>
        <td><%=s.getStuSex()%></td>
    </tr>

    <%	} %>

</table>


</body>

</html>