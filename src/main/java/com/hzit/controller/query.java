package com.hzit.controller;

import com.hzit.bean.Score;
import com.hzit.dao.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

@WebServlet(name ="query",urlPatterns = {"/startQuery"})
public class query extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("测试......................");
        //String query=req.getParameter("query");


        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
      // Score scr=new Score();
        ///scr.setQuery(query);
        PrintWriter wr = resp.getWriter(); //打印输出
        String sql=null;
       sql = "select * from tblstudent where stuname= 'sd' ";
//        if(req.getParameter("all")=="all"){
//             sql = "select * from tblstudent";
//        }else if(req.getParameter("stuname")=="stuname"){
//             sql = "SELECT * from tblstudent where StuName =?";
//
//        }else{
//             sql = "SELECT * from tblstudent where StuId =?";
//        }


        jdbc dbUtil  = new jdbc();


        List<Score> list = dbUtil.query(sql);

        Collections.shuffle(list); //打乱list


        //把后台的数据放入req中
        req.setAttribute("list", list); //把后台的数据放入到req对象中

        //转发到新的页面
        req.getRequestDispatcher("query2.jsp").forward(req, resp);


    }
}
