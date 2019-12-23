package com.zhk.observer;

/**
 * @author 赵洪苛
 * @date 2019/12/23 19:19
 * @description 观察者模式之具体被观察者A
 */
public class ConcreteObserverA implements AbstractObserver {
    @Override
    public void update() {
        System.out.println("ConcreteObserverA：接到了通知");
    }
}
