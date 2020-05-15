package 创建型设计模式.原型模式Prototype_Pattern;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Prototype
 * @date 2020-05-15
 */
public class Prototype implements Cloneable {
    private Integer id;
    private String name;
    private Children children;

    public void setChildren(Children children) {
        this.children = children;
    }

    public Children getChildren() {
        return children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prototype() {
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setId(1);
        prototype.setName("prototype");
        Children children = new Children();
        children.setId(1);
        children.setName("child");
        prototype.setChildren(children);

        Prototype cloneObj = prototype.clone();
        System.out.println(prototype);
        System.out.println(cloneObj);

        System.out.println(prototype.children.toString());
        System.out.println(cloneObj.children.toString());
    }
}
