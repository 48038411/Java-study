package cn.soft1841.Shape;
/**
 * @author  by 郭瑞昌
 * 2019.03.10
 * 定义圆形的计算方法
 */
public class Circle extends Shape {
    public Circle() {
        super();
    }

    public Circle(double x, double y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("圆形的面积为：");
    }

    @Override
    public double getArea() {
        return super.x * super.y *super.x;
    }
}
