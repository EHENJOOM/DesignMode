package com.zhk.state;

/**
 * 模拟电视机电源操作接口
 * @author 赵洪苛
 * @date 2019/12/23 19:39
 * @description 状态模式
 */
public interface PowerController {

    /**
     * 打开电源
     */
    void powerOn();

    /**
     * 关闭电源
     */
    void powerOff();

}
