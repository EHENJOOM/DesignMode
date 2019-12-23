package com.zhk.observer;

/**
 * @author 赵洪苛
 * @date 2019/12/23 19:13
 * @description 观察者模式之观察者接口
 */
public interface AbstractSubject {

    /**
     * 绑定被观察者
     * @param observer 被观察者
     */
    void attach(AbstractObserver observer);

    /**
     * 解绑被观察者
     * @param observer 被观察者
     */
    void detach(AbstractObserver observer);

    /**
     * 通知变动
     */
    void notifyChanged();

}
