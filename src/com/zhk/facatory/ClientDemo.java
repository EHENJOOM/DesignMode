package com.zhk.facatory;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:26
 * @description 静态工厂模式之演示类
 */
public class ClientDemo {

    public static void main(String[] args) {
        AbstractProduct product = StaticFactory.productB();
        System.out.println(product.work());
    }

}
