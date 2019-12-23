package com.zhk.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:43
 * @description 迭代器模式之A具体容器。容器对外隐藏了具体实现细节，只留下遍历的接口。
 */
public class ConcreteAggregateA implements AbstractAggregate<Student> {

    private List<Student> studentList = new LinkedList<>();

    public ConcreteAggregateA() {
        // 此处仅做展示，不建议大家把数据初始化写在构造函数里
        studentList.add(new Student("小明", 18, "男"));
        studentList.add(new Student("小红", 19, "女"));
    }

    @Override
    public void add(Student obj) {
        studentList.add(obj);
    }

    @Override
    public void remove(Student obj) {
        studentList.remove(obj);
    }

    @Override
    public AbstractIterator<Student> iterator() {
        return new ConcreteIteratorA(studentList);
    }
}
