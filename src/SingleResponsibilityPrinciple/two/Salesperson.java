package SingleResponsibilityPrinciple.two;


import SingleResponsibilityPrinciple.two.PerformanceManager.PerformanceCalculator;
import SingleResponsibilityPrinciple.two.PerformanceManager.PerformanceCalculatorManager;
import SingleResponsibilityPrinciple.two.goods.Goods;
import SingleResponsibilityPrinciple.two.repository.Repository;
import SingleResponsibilityPrinciple.two.repository.RepositoryManager;

import java.util.List;

public class Salesperson {
    private int id;

    public Salesperson(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     * 상품을 판매했고 그 기록을 저장한다.
     * */
    public void saleGoods(Goods goods) {
        Repository repository = RepositoryManager.getInstance();
        repository.save(this, goods);

        /*goodsList.add(goods);*/
    }

    /**
     * 제거
     * */
    /*public List<SingleResponsibilityPrinciple.one.goods.Goods> getAllGoods() {
        return goodsList;
    }*/

    /**
     * 제거
     * */
    /*public void calculatePay()*/

    @Override
    public String toString() {
        PerformanceCalculator performanceCalculator = PerformanceCalculatorManager.getInstance();
        int pay = performanceCalculator.calculatePay(this);

        return "pay is : " + pay;
    }

}
