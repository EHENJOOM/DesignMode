package com.zhk.facatory;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:23
 * @description 静态工厂模式之B产品类
 */
public class ConcreteProductB implements AbstractProduct {

    @Override
    public String work() {
        return "ConcreteProductB";
    }
}
