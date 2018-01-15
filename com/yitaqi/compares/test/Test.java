package com.yitaqi.compares.test;

import com.yitaqi.compares.comparator.StudentComparator;

import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        TestData data = new TestData();
        Collections.sort(data.getComparableStu());
        System.out.println(data.getComparableStu());
        Collections.sort(data.getComparatorStu(), new StudentComparator());
        System.out.println(data.getComparatorStu());
    }
}
