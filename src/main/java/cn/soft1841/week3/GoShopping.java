package cn.soft1841.week3;

/**
 * @author  by 郭瑞昌
 * 2019.01.10
 * 去商场购物的实现类
 */
public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();//使用派生类对象创建抽象类对象
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
