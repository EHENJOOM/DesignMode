package com.zhk.single;

/**
 * 此实现方式不仅能够保证线程安全，也能保证单例的唯一性，延迟了单例的实例化，所以这是比较推荐使用的单例实现方式。
 * 但是在需要传参来实例化单例时，静态类往往需要静态参数，这时静态内部类并不能满足需求了，这需要用到枚举类实现。
 * @author 赵洪苛
 * @date 2019/12/23 14:02
 * @description 单例模式实现方式之静态内部类
 */
public class SingleStaticInnerClass {

    private SingleStaticInnerClass() {}

    /**
     * 静态内部类
     */
    private static class SingleHolder{
        private static final SingleStaticInnerClass INSTANCE = new SingleStaticInnerClass();
    }

    public static SingleStaticInnerClass getInstance() {
        return SingleHolder.INSTANCE;
    }

}
