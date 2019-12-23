package com.zhk.facatory;

/**
 * @author 赵洪苛
 * @date 2019/12/23 14:18
 * @description 静态工厂模式之产品生产接口，所有产品类都要实现此接口
 */
public interface AbstractProduct {

    /**
     * 每一个产品类都要进行的的工作，这里就用返回字符串做演示。
     * @return 产品类工作后的结果
     */
    String work();

}
