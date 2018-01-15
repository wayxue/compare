package com.yitaqi.compares.comparable;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int score;

    public Student() {}

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        int res = this.score - o.score;
        if (res > 0) {
            return -1;// 从高到低排序
        } else if (res < 0) {
            return 1;
        } else {
            if (this.age > o.age) {
                return 1;// 从低到高排序
            } else if (this.age < o.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
