package com.hzit.dao;

import com.hzit.bean.Score;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbc {
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";
    private final static String USER = "root";
    private final static String PASSWORD = "0608";


    //加载驱动
    //获取连接
    public static Connection getCon() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//通过反射加载mysql驱动

            connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int add(String sql, Score sc) throws SQLException {
        Connection Con = jdbc.getCon();
        PreparedStatement preparedStatement = Con.prepareStatement(sql);
        //补充占位符
        preparedStatement.setObject(1, sc.getStuId());
        preparedStatement.setObject(2, sc.getStuName());
        preparedStatement.setObject(3, sc.getStuAge());
        preparedStatement.setObject(4, sc.getStuSex());

        int rlt = preparedStatement.executeUpdate();


        return rlt;
    }

    public List<Score> query(String sql,String scd) {

        Connection con = jdbc.getCon();

        PreparedStatement pst = null;

        ResultSet set = null;
        try {


            pst = con.prepareStatement(sql);
            if("".equals(scd)){

            }else {
                pst.setString(1, scd);
            }
            set = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.print("ssdf"+scd);
        List<Score> list = new ArrayList<Score>();
        String name = null;
        String age = null;
        String id = null;
        String sex = null;

        while (true) {

            try {
                if (!set.next()) break;
                name = set.getString("StuName");
                id = set.getString("StuId");
                age = set.getString("StuAge");
                sex = set.getString("StuSex");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Score s = new Score();

            s.setStuName(name);
            s.setStuAge(age);
            s.setStuId(id);
            s.setStuSex(sex);

            list.add(s);

        }

        return list;


    }
    public List<Score> query(String sql) {

        Connection con = jdbc.getCon();

        PreparedStatement pst = null;

        ResultSet set = null;
        try {

          //  pst.setObject(1,sc.getQuery());
            pst = con.prepareStatement(sql);
            set = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Score> list = new ArrayList<Score>();
        String name = null;
        String age = null;
        String id = null;
        String sex = null;
        while (true) {

            try {
                if (!set.next()) break;
                name = set.getString("StuName");
                id = set.getString("StuId");
                age = set.getString("StuAge");
                sex = set.getString("StuSex");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Score s = new Score();

            s.setStuName(name);
            s.setStuAge(age);
            s.setStuId(id);
            s.setStuSex(sex);

            list.add(s);

        }

        return list;


    }

}
