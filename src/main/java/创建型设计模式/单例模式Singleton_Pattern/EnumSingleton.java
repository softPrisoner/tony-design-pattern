package 创建型设计模式.单例模式Singleton_Pattern;

import 创建型设计模式.单例模式Singleton_Pattern.utils.ReflectAccessUtil;

/**
 * 内部枚举类单例模式
 *
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description EnumSingleton
 * @date 2020-05-15
 */
public class EnumSingleton {

    private EnumSingleton() {

    }

    public static EnumSingleton getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    private enum SingletonEnum {
        /**
         *
         */
        INSTANCE;
        private final EnumSingleton instance;

        SingletonEnum() {
            instance = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println(instance);
        EnumSingleton enumSingleton = ReflectAccessUtil.createObject(EnumSingleton.class);
        System.out.println(enumSingleton);
    }
}
