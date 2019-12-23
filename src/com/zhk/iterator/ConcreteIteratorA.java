package com.zhk.iterator;

import java.util.List;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:35
 * @description 迭代器模式之具体的A迭代器实现
 */
public class ConcreteIteratorA implements AbstractIterator<Student> {

    private List<Student> studentList;

    private int position;

    public ConcreteIteratorA(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size() && studentList.get(position) != null;
    }

    @Override
    public Student next() {
        return studentList.get(position++);
    }
}
