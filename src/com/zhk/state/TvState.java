package com.zhk.state;

/**
 * 模拟电视状态的接口，定义了电视操作的方法。
 * @author 赵洪苛
 * @date 2019/12/23 19:34
 * @description 状态模式
 */
public interface TvState {

    /**
     * 模拟电视机切换下一频道
     */
    void nextChannel();

    /**
     * 模拟电视机切换上一频道
     */
    void prevChannel();

    /**
     * 模拟电视机调大声音
     */
    void turnUp();

    /**
     * 模拟电视机调小声音
     */
    void turnDown();
}
