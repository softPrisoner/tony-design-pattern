package 创建型设计模式.原型模式Prototype_Pattern.demo;

import java.util.Scanner;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Circle
 * @date 2020-05-15
 */
class Circle implements Shape {
    @Override
    public void computeArea() {
        int r = 0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone the circle failed.");
        }
        return null;
    }
}
