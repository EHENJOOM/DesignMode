package com.zhk.iterator;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:30
 * @description 迭代器模式之学生数据实体类。此类仅用于迭代器模式演示的模拟复杂数据。
 */
public class Student {

    private String name;

    private int age;

    private String sex;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
