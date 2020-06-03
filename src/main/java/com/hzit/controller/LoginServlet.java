package com.hzit.controller;
import com.alibaba.fastjson.JSONObject;
import javafx.scene.control.Alert;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "login",urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html charset=utf-8");//设置编码格式
        resp.setCharacterEncoding("UTF-8");

        String userName = req.getParameter("username");//获取用户框的输入值
        //调用方法
        String password = req.getParameter("password");



   }
}
