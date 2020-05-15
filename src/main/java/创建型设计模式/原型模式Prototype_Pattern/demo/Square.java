package 创建型设计模式.原型模式Prototype_Pattern.demo;

import java.util.Scanner;

/**
 * @author wabslygzj@163.com (Tony Li)
 * @copyright rainbow
 * @description Square
 * @date 2020-05-15
 */
public class Square implements Shape {
    @Override
    public void computeArea() {
        int a = 0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + a * a + "\n");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone the square failed.");
        }
        return null;
    }
}
