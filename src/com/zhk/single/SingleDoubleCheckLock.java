package com.zhk.single;

/**
 * 由于Java内存模型的原因，双检查锁实现方式偶尔会失败，在高并发的环境下也有一定的缺陷。
 * 在JDK 6以下的版本或者并发场景比较复杂时，不建议使用此方式。
 * @author 赵洪苛
 * @date 2019/12/23 13:57
 * @description 单例模式实现方式之双检查锁
 */
public class SingleDoubleCheckLock {

    private volatile static SingleDoubleCheckLock INSTANCE;

    private SingleDoubleCheckLock() {}

    public static SingleDoubleCheckLock getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleDoubleCheckLock.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleDoubleCheckLock();
                }
            }
        }
        return INSTANCE;
    }

}
