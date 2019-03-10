package cn.soft1841.spirit;

public class Spirit {
    public static void main(String[] args) {
        MoveApp moveApp = new MoveApp();
        SingApp singApp = new SingApp();
        System.out.println("精灵们一边" + singApp.sing() + "，一边" + moveApp.move());
    }
}
