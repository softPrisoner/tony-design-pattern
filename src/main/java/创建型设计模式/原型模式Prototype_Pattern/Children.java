package 创建型设计模式.原型模式Prototype_Pattern;

/**
 *
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Children
 * @date 2020-05-15
 */
public class Children {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Children{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
