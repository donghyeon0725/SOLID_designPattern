package SingleResponsibilityPrinciple.last.person;

import SingleResponsibilityPrinciple.last.PerformanceManager.PerformanceCalculator;
import SingleResponsibilityPrinciple.last.PerformanceManager.PerformanceCalculatorManager;
import SingleResponsibilityPrinciple.last.goods.Goods;
import SingleResponsibilityPrinciple.last.repository.Repository;
import SingleResponsibilityPrinciple.last.repository.RepositoryManager;

public class IceCreamSalesmap implements Salesperson {
    private Integer id;

    public IceCreamSalesmap(Integer id) {
        this.id = id;
    }

    // 물건을 판매
    @Override
    public void saleGoods(Goods goods) {
        Repository repository = RepositoryManager.getInstance();

        repository.save(this, goods);
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public String toString() {
        PerformanceCalculator performanceCalculator = PerformanceCalculatorManager.getInstance();
        int money = performanceCalculator.calculatePay(this);

        return "Cashier{" +
                "id=" + this.getID() +
                "} pay is : " + money;
    }
}
