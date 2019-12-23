package com.zhk.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 赵洪苛
 * @date 2019/12/23 19:17
 * @description 观察者模式之具体观察者A
 */
public class ConcreteSubjectA implements AbstractSubject {

    private List<AbstractObserver> observerList = new LinkedList<>();

    @Override
    public void attach(AbstractObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(AbstractObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyChanged() {
        for (AbstractObserver observer : observerList) {
            observer.update();
        }
    }
}
