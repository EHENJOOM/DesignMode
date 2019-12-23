package com.zhk.observer;

/**
 * @author 赵洪苛
 * @date 2019/12/23 19:14
 * @description 观察者模式之被观察者接口
 */
public interface AbstractObserver {

    /**
     * 接收变动通知
     */
    void update();

}
