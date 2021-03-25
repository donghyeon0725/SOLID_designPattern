package SingleResponsibilityPrinciple.last.PerformanceManager;

import SingleResponsibilityPrinciple.last.goods.Goods;
import SingleResponsibilityPrinciple.last.person.Salesperson;
import SingleResponsibilityPrinciple.last.repository.Repository;
import java.util.List;

class PerformanceCalculatorImpl implements PerformanceCalculator {
    private Repository repository;

    public PerformanceCalculatorImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Integer calculatePay(Salesperson person) {
        int total;
        List<Goods> goods = repository.getAllGoods(person);
        // 계산해주는 기능
        total = goods.stream().mapToInt(e -> (int) (e.getPrice() * (e.getMargin() / (double)100))).sum();


        return total;
    }
}