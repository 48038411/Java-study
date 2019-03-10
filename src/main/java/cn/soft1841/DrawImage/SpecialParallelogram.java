package cn.soft1841.DrawImage;

/**
 * @author by 郭瑞昌
 * 2019.03.10
 * 定义画特殊图形的实现类
 */
public class SpecialParallelogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};//定义一维数组
        for(int i = 0; i < images.length; i++){
            images[i].draw();//调用draw()方法
        }
    }
}
