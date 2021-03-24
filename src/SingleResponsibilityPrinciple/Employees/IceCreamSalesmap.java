package SingleResponsibilityPrinciple.Employees;

import SingleResponsibilityPrinciple.PerformanceManager.PerformanceCalculator;
import SingleResponsibilityPrinciple.PerformanceManager.PerformanceCalculatorManager;
import SingleResponsibilityPrinciple.PerformanceManager.Money;
import SingleResponsibilityPrinciple.goods.Goods;
import SingleResponsibilityPrinciple.repository.Repository;
import SingleResponsibilityPrinciple.repository.RepositoryManager;

public class IceCreamSalesmap extends SocietyPersonImpl implements Salesperson {
    public IceCreamSalesmap(Integer id, String name) {
        super(id, name);
    }

    // 물건을 판매
    @Override
    public void saleGoods(Goods goods) {
        Repository repository = RepositoryManager.getInstance();

        repository.save(this, goods);
    }

    @Override
    public String toString() {
        PerformanceCalculator performanceCalculator = PerformanceCalculatorManager.getInstance();
        Money money = performanceCalculator.calculatePay(this);

        return "Cashier{" +
                "id=" + super.getUserID() +
                ", name='" + super.getName() + '\'' +
                "} pay is : " + money.getMoney();
    }
}
