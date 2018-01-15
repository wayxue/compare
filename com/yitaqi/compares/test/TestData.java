package com.yitaqi.compares.test;

import com.yitaqi.compares.comparable.Student;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    private List<Student> comparableStu;
    private List<com.yitaqi.compares.comparator.Student> comparatorStu;

    public TestData() {
        comparableStu = new ArrayList<Student>();
        comparatorStu = new ArrayList<com.yitaqi.compares.comparator.Student>();
        Student student1 = new Student("libai", 70, 80);
        com.yitaqi.compares.comparator.Student stu1
                    = new com.yitaqi.compares.comparator.Student("libai", 70, 80);
        Student student2 = new Student("dufu", 50, 58);
        com.yitaqi.compares.comparator.Student stu2
                = new com.yitaqi.compares.comparator.Student("dufu", 50, 58);
        Student student3 = new Student("baijuyi", 35, 62);
        com.yitaqi.compares.comparator.Student stu3
                = new com.yitaqi.compares.comparator.Student("baijuyi", 35, 58);
        comparableStu.add(student1);
        comparableStu.add(student2);
        comparableStu.add(student3);
        comparatorStu.add(stu1);
        comparatorStu.add(stu2);
        comparatorStu.add(stu3);
    }

    public List<Student> getComparableStu() {
        return comparableStu;
    }

    public List<com.yitaqi.compares.comparator.Student> getComparatorStu() {
        return comparatorStu;
    }
}
