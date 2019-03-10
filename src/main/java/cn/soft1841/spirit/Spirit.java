package cn.soft1841.spirit;

/**
 * @author  by 郭瑞昌
 * 2019.03.10
 * 实现精灵类
 */
public class Spirit implements Move,Sing {
    @Override
    public String move() {
        return "移动着";
    }

    @Override
    public String sing() {
        return "唱歌";
    }

    public static void main(String[] args) {
        Spirit spirit = new Spirit();
        System.out.println("精灵们一边" + spirit.sing() + "，一边" + spirit.move());
    }
}
