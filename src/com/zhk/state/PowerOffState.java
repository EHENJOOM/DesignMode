package com.zhk.state;

/**
 * 模拟电视机关机状态，此时只有开机功能有效
 * @author 赵洪苛
 * @date 2019/12/23 19:36
 * @description 状态模式
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
