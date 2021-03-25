package SingleResponsibilityPrinciple.two.PerformanceManager;


import SingleResponsibilityPrinciple.two.Salesperson;
import SingleResponsibilityPrinciple.two.goods.Goods;
import SingleResponsibilityPrinciple.two.repository.Repository;

import java.util.List;

class PerformanceCalculatorImpl implements PerformanceCalculator {
    private Repository repository;

    public PerformanceCalculatorImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public int calculatePay(Salesperson salesperson) {
        int total;
        List<Goods> goods = repository.getAllGoods(salesperson);
        // 계산해주는 기능
        total = goods.stream().mapToInt(e -> (int) (e.getPrice() * (e.getMargin() / (double)100))).sum();


        return total;
    }
}