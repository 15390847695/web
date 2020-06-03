package com.hzit.controller;

import com.hzit.bean.Score;
import com.hzit.dao.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "addStudent",urlPatterns = {"/addStudent"})
public class addStudent  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到添加学生成绩的请求");
        String stuid=req.getParameter("stuId");
        String courseid=req.getParameter("CourseId");

        String score=req.getParameter("Score");
        String sex=req.getParameter("sex");
        System.out.println("stuid="+stuid);
        //score s=new score();
        Score score1 = new Score();
        score1.setStuId(stuid);
        score1.setStuName(courseid);
        score1.setStuAge(score);
        score1.setStuSex(sex);



//        s.setCourseId(courseid);
//        s.setScore(score);
//        s.setStuId(stuid);

        jdbc jd =new jdbc();
        String sql="insert into tblstudent (stuId,stuName,stuAge,stuSex) values (?,?,?,?)";

        try {
            jd.add(sql,score1);
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
