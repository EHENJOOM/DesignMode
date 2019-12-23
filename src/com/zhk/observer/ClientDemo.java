package com.zhk.observer;

/**
 * @author 赵洪苛
 * @date 2019/12/23 19:21
 * @description 观察者模式之演示demo
 */
public class ClientDemo {

    public static void main(String[] main) {
        AbstractObserver observer = new ConcreteObserverA();
        AbstractSubject subject = new ConcreteSubjectA();
        subject.attach(observer);
        subject.notifyChanged();
        subject.detach(observer);
    }

}
