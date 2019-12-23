package com.zhk.state;

/**
 * 模拟电视机开机状态，此时再出发开机功能不做任何操作
 * @author 赵洪苛
 * @date 2019/12/23 19:37
 * @description 状态模式
 */
public class PowerOnState implements TvState {

    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
