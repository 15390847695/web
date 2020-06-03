package com.hzit.utils;

import java.sql.*;
//数据库连接步骤
//1.加载驱动
//2.获取连接
//3.创建数据库的连接
//4.创建一个Statement
//5.执行sql

public class JDBCUtils {

    private static String URL="jdbc:mysql://localhost:3306/management?serverTimezone=GMT%2B8";
    private static String NAME="root";
    private static String PASSWORD="0608";

    /**
     * 获取连接
     * @return
     */
    public static Connection getConnection(){

        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");//反射
            //获取链接
            Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
            return connection;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 释放资源
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void closeAll(ResultSet resultSet, Statement statement,Connection connection){

        if (resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 通用增删改
     * @param sql
     * @param args
     * @return
     */
    public static boolean excuteUpdate(String sql,Object...args){
        //insert into teacher(id,name) values(?,？)
        //获取链接
        Connection connection = getConnection();
        PreparedStatement preparedStatement=null;
        try {
            //预编译sql语句
            preparedStatement = connection.prepareStatement(sql);
            //填充占位符
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1,args[i]);
            }
            int i = preparedStatement.executeUpdate();
            return i>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(null,preparedStatement,connection);
        }
        return  false;
    }
}
