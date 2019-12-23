package com.zhk.iterator;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:40
 * @description 迭代器模式之容器接口，具体容器必须实现此接口
 */
public interface AbstractAggregate<T> {

    /**
     * 向容器里添加一个元素
     * @param obj 元素对象
     */
    void add(T obj);

    /**
     * 移除容器里一个元素
     * @param obj 元素对象
     */
    void remove(T obj);

    /**
     * 获取容器的迭代器
     * @return 迭代器对象
     */
    AbstractIterator<T> iterator();

}
