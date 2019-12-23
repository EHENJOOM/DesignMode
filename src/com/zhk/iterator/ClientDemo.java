package com.zhk.iterator;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:50
 * @description 迭代器模式之演示demo
 */
public class ClientDemo {

    public static void main(String[] args) {
        ConcreteAggregateA aggregateA = new ConcreteAggregateA();
        AbstractIterator iterator = aggregateA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
