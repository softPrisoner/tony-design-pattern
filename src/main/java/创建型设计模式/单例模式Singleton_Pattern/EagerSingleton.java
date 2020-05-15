package 创建型设计模式.单例模式Singleton_Pattern;

import 创建型设计模式.单例模式Singleton_Pattern.utils.ReflectAccessUtil;

/**
 * 简单饿汉单例模式
 *
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description EagerSingleton
 * @date 2020-05-15
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        System.out.println(instance);
        EagerSingleton eagerSingleton = ReflectAccessUtil.createObject(EagerSingleton.class);
        System.out.println(eagerSingleton);
    }
}
