package com.zhk.state;

/**
 * 模式电视遥控器
 * @author 赵洪苛
 * @date 2019/12/23 19:41
 * @description 状态模式
 */
public class TvController implements PowerController {

    private TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
    }

    public void nextChannel() {
        tvState.nextChannel();
    }

    public void prevChannel() {
        tvState.prevChannel();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }
}
