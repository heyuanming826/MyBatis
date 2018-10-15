package com.newer.bean;

import java.io.Serializable;
import java.util.List;

public class ClassInfo implements Serializable {
    private Integer cId;
    private String cName;
    private String cGrade;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcGrade() {
        return cGrade;
    }

    public void setcGrade(String cGrade) {
        this.cGrade = cGrade;
    }
}
