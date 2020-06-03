package com.hzit.model;

import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

public class score {
    private String courseId;
    private String scroe;
    private String stuId;

    public String getScroe() {
        return scroe;
    }

    public String getStuId() {
        return stuId;
    }

    public String getCourseId() {
        return courseId;

    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setScroe(String scroe) {
        this.scroe = scroe;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
