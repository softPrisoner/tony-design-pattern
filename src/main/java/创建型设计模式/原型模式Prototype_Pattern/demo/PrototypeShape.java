package 创建型设计模式.原型模式Prototype_Pattern.demo;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description PrototypeShape
 * @date 2020-05-15
 */
public class PrototypeShape {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeManager manager = new PrototypeManager();
        Shape circle = manager.getShape("Circle");
        System.out.println(circle);
        Shape square = manager.getShape("Square");
        circle.computeArea();
        square.computeArea();
    }
}
