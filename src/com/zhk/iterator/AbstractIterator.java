package com.zhk.iterator;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:32
 * @description 迭代器模式之迭代器接口，所有具体的迭代器都要实现此接口
 */
public interface AbstractIterator<T> {

    /**
     * 是否还有下一个元素
     * @return true：有下一个元素   false：没有下一个元素
     */
    boolean hasNext();

    /**
     * 返回当前元素的位置，并将位置移至下一位
     * @return 下一位元素
     */
    T next();

}
