package com.hzit.test;

import com.hzit.bean.Teacher;
import com.hzit.dao.TeacherDao;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class tests {


    @Test
    public void testTime(){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(date);
        System.out.println(format);
    }

    @Test
    public void testFind(){
        TeacherDao teacherDao=new TeacherDao();
        List<Teacher> all = teacherDao.findAll();
        for (Teacher teacher : all) {
            System.out.println(teacher);
        }
    }
}
