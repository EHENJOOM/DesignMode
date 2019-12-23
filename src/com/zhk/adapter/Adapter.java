package com.zhk.adapter;

/**
 * @author 赵洪苛
 * @date 2019/12/23 18:43
 * @description 适配器模式之适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void operateA() {
        this.operateA();
        // 其他适配的逻辑代码
    }

    @Override
    public void operateB() {
        // 适配的逻辑代码
    }
}
