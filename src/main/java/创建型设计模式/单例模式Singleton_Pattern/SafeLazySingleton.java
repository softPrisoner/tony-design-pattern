package 创建型设计模式.单例模式Singleton_Pattern;

/**
 * 双重加锁懒汉单例模式
 *
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description SafeLazySingleton
 * @date 2020-05-15
 */
public class SafeLazySingleton {
    private volatile static SafeLazySingleton instance;

    private SafeLazySingleton() {

    }

    public static SafeLazySingleton getSingleton() {
        if (instance == null) {
            synchronized (SafeLazySingleton.class) {
                if (instance == null) {
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }

}
