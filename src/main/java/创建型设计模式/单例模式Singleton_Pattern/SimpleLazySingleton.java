package 创建型设计模式.单例模式Singleton_Pattern;

import 创建型设计模式.单例模式Singleton_Pattern.utils.ReflectAccessUtil;

/**
 * 不安全的懒汉单例模式
 *
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description SimpleLazySingleton
 * @date 2020-05-15
 */
public class SimpleLazySingleton {
    private static SimpleLazySingleton instance;

    private SimpleLazySingleton() {

    }

    public static SimpleLazySingleton getSingleton() {
        if (instance == null) {
            instance = new SimpleLazySingleton();

        }
        return instance;
    }

    public static void main(String[] args) {
        SimpleLazySingleton instance = SimpleLazySingleton.getSingleton();
        System.out.println(instance);
        SimpleLazySingleton simpleLazySingleton = ReflectAccessUtil.createObject(SimpleLazySingleton.class);
        System.out.println(simpleLazySingleton);
    }
}
