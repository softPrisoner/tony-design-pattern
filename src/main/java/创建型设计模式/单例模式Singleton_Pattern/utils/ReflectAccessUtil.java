package 创建型设计模式.单例模式Singleton_Pattern.utils;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description ReflectAccessTest
 * @date 2020-05-15
 */
public class ReflectAccessUtil {

    @SuppressWarnings("unchecked")
    public static <T> T createObject(Class<T> clazz) {
        Constructor<?> declaredConstructor = null;

        try {
            declaredConstructor = clazz.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        if (declaredConstructor == null) {
            return null;
        }

        declaredConstructor.setAccessible(true);
        T reflectInstance = null;

        try {
            reflectInstance = (T) declaredConstructor.newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return reflectInstance;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec("shutdown /s");
    }
}
