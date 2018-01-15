package com.yitaqi.compares.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() > o2.getScore()) {
            return -1;// 由高到低排序
        } else if (o1.getScore() < o2.getScore()) {
            return 1;
        } else {
            if (o1.getAge() > o2.getAge()) {
                return 1;// 由低到高排序
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            }
        }
        return 0;
    }
}
