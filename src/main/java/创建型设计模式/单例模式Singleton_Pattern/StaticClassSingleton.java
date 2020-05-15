package 创建型设计模式.单例模式Singleton_Pattern;

/**
 * 静态内部类单例模式
 *
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description StaticClassSingleton
 * @date 2020-05-15
 */
public class StaticClassSingleton {

    private StaticClassSingleton() {

    }

    public static StaticClassSingleton getSingleton() {
        return SingletonHolder.INSTANCE;
    }

    public static final class SingletonHolder {
        public static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }
}
