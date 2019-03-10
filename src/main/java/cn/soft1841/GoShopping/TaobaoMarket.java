package cn.soft1841.GoShopping;

/**
 * @author  by 郭瑞昌
 * 2019.03.10
 * 定义shop方法类
 */
public class TaobaoMarket extends Market {
    @Override
    public void shop() {
        System.out.println(name+ "网购" +goods);
    }
}
