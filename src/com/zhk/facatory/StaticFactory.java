package com.zhk.facatory;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:24
 * @description 静态工厂模式之工厂类
 */
public class StaticFactory {

    /**
     * 生产A产品类
     * @return 生产出的产品类
     */
    public static AbstractProduct productA() {
        return new ConcreteProductA();
    }

    /**
     * 生产B产品类
     * @return 生产出的产品类
     */
    public static AbstractProduct productB() {
        return new ConcreteProductB();
    }

}
