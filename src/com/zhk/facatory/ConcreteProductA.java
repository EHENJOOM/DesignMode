package com.zhk.facatory;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:20
 * @description 静态工厂模式之A产品类
 */
public class ConcreteProductA implements AbstractProduct {

    @Override
    public String work() {
        return "ConcreteProductA";
    }

}
