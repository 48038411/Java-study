package cn.soft1841.GoShopping;

/**
 * @author  by 郭瑞昌
 * 2019.03.10
 * 定义shop方法类
 */
public class WallMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name + "实体店购买" +goods);
    }
}
