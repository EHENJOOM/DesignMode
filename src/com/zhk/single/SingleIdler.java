package com.zhk.single;

/**
 * <p>懒汉单例模式的优点是只有在使用时才会被实例化，一定程度地节约了资源。
 * 缺点是每次调用都会进行同步，造成不必要的同步开销，会导致在高并发情况下性能不足。</p>
 * @author 赵洪苛
 * @date 2019/12/23 13:52
 * @description 单例模式实现方式之懒汉模式。
 */
public class SingleIdler {

    private static SingleIdler INSTANCE;

    /**
     * 将构造函数私有化，防止外部调用，实现单例。
     */
    private SingleIdler() {}

    public static synchronized SingleIdler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleIdler();
        }
        return INSTANCE;
    }

}
