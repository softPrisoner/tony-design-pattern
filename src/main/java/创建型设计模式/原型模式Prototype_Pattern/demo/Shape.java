package 创建型设计模式.原型模式Prototype_Pattern.demo;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Shape
 * @date 2020-05-15
 */
public interface Shape extends Cloneable {
    public void computeArea();

    Object clone() throws CloneNotSupportedException;
}
