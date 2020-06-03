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
@WebServlet(name = "query1",urlPatterns = {"/query"})
public class query1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query = req.getParameter("query");
        System.out.println("query=" + query);
        String query1 = req.getParameter("cars");
        System.out.println("query1=" + query1);

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
        Score scr=new Score();

        scr.setQuery(query);
        System.out.println("e5354364"+scr.getQuery());
        PrintWriter wr = resp.getWriter(); //打印输出
        String sql=null;
//
        if("all".equals(req.getParameter("cars"))){
             sql = "select * from tblstudent";
        }else if("stuname".equals(req.getParameter("cars"))){
             sql = "SELECT * from tblstudent where StuName =?";

        }else{
             sql = "SELECT * from tblstudent where StuId =?";
        }


        jdbc dbUtil  = new jdbc();
//
        List<Score> list = dbUtil.query(sql,scr.getQuery());
//
        req.setAttribute("list", list); //把后台的数据放入到req对象中
//
//        //转发到新的页面
        req.getRequestDispatcher("query2.jsp").forward(req, resp);
//    }
    }
}
