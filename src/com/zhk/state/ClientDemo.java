package com.zhk.state;

/**
 * @author 赵洪苛
 * @date 2019/12/23 19:44
 * @description 状态模式之演示demo
 */
public class ClientDemo {

    public static void main(String[] args) {
        TvController tvController = new TvController();

        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        tvController.powerOff();
    }

}
