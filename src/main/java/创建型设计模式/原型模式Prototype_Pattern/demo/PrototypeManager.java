package 创建型设计模式.原型模式Prototype_Pattern.demo;

import java.util.HashMap;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description PrototypeManager
 * @date 2020-05-15
 */
public class PrototypeManager {
    private final HashMap<String, Shape> prototypes = new HashMap<>(16);

    PrototypeManager() {
        prototypes.put("Circle", new Circle());
        prototypes.put("Square", new Square());
    }

    public void addShape(String key, Shape shape) {
        prototypes.put(key, shape);
    }

    public Shape getShape(String key) throws CloneNotSupportedException {
        Shape shape = prototypes.get(key);
        return (Shape) shape.clone();
    }

}
