package com.hzit.dao;

import com.hzit.bean.Teacher;
import com.hzit.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

public class TeacherDao {

    /**
     * 增加Teacher
     * @param teacher
     * @return
     */
    public boolean addTeacher(Teacher teacher){

        String sql="INSERT INTO teacher(tnumber,tname,tbirthday,tgender,tmajor,tphone) VALUES(?,?,?,?,?,?)";
        boolean b = JDBCUtils.excuteUpdate(sql, teacher.getTmajor(), teacher.getTname(), teacher.getTmajor());
        return b;
    }

    /**
     * 根据id删除teacher
     * @param id
     * @return
     */
    public boolean deleteTeacherById(int id){

        String sql="DELETE  FROM teacher where id=?";
        boolean b = JDBCUtils.excuteUpdate(sql, id);
        return b;
    }

    /**
     * 更新teacher
     * @param teacher
     * @return
     */
    public boolean updateTeacher(Teacher teacher){

        String sql="UPDATE teacher SET tnumber=?,tname=?,tbirthday=?,tgender=?,tmajor=?,tphone=? WHERE id=?";
        //date格式转换
        Date tbirthday = teacher.getTbirthday();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data = df.format(tbirthday);
        boolean b = JDBCUtils.excuteUpdate(sql, teacher.getTnumber(), teacher.getTname(), data, teacher.getTgender(), teacher.getTmajor(), teacher.getTphone(), teacher.getId());
        return b;
    }

    public List<Teacher> findAll(){
        //获取连接
        Connection connection = JDBCUtils.getConnection();
        ArrayList<Teacher> list = new ArrayList<>();
        String sql="SELECT * FROM teacher";
        try {
            //预编译sql
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //填充占位符
            //执行sql,获取结果集
            ResultSet resultSet = preparedStatement.executeQuery();
            //封装结果集
            while (resultSet.next()){
                String tnumber = resultSet.getString("tnumber");
                String tname = resultSet.getString("tname");
                String tbirthday = resultSet.getString("tbirthday");
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = df.parse(tbirthday);
                String tgender = resultSet.getString("tgender");
                String tmajor = resultSet.getString("tmajor");
                String tphone = resultSet.getString("tphone");
                Teacher teacher = new Teacher(tnumber, tname, date, tgender, tmajor, tphone);
                list.add(teacher);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
