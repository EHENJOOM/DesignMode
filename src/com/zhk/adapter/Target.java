package com.zhk.adapter;

/**
 * @author 赵洪苛
 * @date 2019/12/23 18:39
 * @description 适配器模式之目标接口，也就是期待得到的接口。
 */
public interface Target {

    /**
     * 目标角色拥有的接口A
     */
    void operateA();

    /**
     * 目标角色拥有的接口B
     */
    void operateB();

}
