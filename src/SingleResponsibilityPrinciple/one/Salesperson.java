package SingleResponsibilityPrinciple.one;


import SingleResponsibilityPrinciple.one.goods.Goods;

import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private List<Goods> goodsList = new ArrayList<>();
    private int pay;

    /**
     * 상품을 판매했고 그 기록을 저장한다.
     * */
    public void saleGoods(Goods goods) {
        goodsList.add(goods);
    }

    /**
     * 판매한 상품 기록을 가져온다.
     * */
    public List<Goods> getAllGoods() {
        return goodsList;
    }

    /**
     * 저장된 기록을 토대로 급여를 책정한다.
     * */
    public void calculatePay() {
        this.pay = goodsList.stream().mapToInt(e -> (int) (e.getPrice() * (e.getMargin() / (double)100))).sum();
    }

    @Override
    public String toString() {
        return "pay is : " + this.pay;
    }

}
