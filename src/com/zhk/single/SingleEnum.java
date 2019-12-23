package com.zhk.single;

/**
 * 使用枚举类的方式写法很简单，在任何情况下，默认枚举实例的创建都是线程安全的。
 * 并且其他实现方式在反序列化时会创建不止一个实例对象，但枚举单例只有一个实例对象。
 * 单例类的方法写法和普通类方法的写法一模一样。
 * 因此，建议写代码时都用单例类实现方式来实现单例的创建。
 * @author 赵洪苛
 * @date 2019/12/23 14:08
 * @description 单例模式实现方式之枚举类
 */
public enum SingleEnum {

    /**
     * 自动实例化的单例实例
     */
    INSTANCE;

    public SingleEnum getInstance() {
        return INSTANCE;
    }

}
