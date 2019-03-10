package cn.soft1841.Shape;
/**
 * @author  by 郭瑞昌
 * 2019.03.10
 * 定义计算矩形面积的方法
 */
public class Rectangle  extends Shape {
    public Rectangle() {
        super();
    }

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("矩形的面积为：");
    }

    @Override
    public double getArea() {
        return super.x * super.y;
    }
}
