package cn.soft1841.Shape;

/**
 * @author by郭瑞昌
 * 2019.03.10
 * 定义图形类的属性以及计算方法
 */
public abstract class Shape {
    protected double x;
    protected double y;

    public Shape() {
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //声明了一个非抽象方法，带方法体
    public void show(){
        System.out.println("面积为");
    }
    //声明了一个抽象方法，不能带方法体
    public abstract double getArea();
}
