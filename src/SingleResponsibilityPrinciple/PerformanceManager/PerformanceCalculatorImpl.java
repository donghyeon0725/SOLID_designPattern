package SingleResponsibilityPrinciple.PerformanceManager;

import SingleResponsibilityPrinciple.Employees.SocietyPerson;
import SingleResponsibilityPrinciple.goods.Goods;
import SingleResponsibilityPrinciple.repository.Repository;

import java.util.List;

class PerformanceCalculatorImpl implements PerformanceCalculator {
    private Repository repository;

    public PerformanceCalculatorImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Money calculatePay(SocietyPerson employee) {
        int total;
        List<Goods> goods = repository.getAllGoods(employee);
        // 계산해주는 기능
        total = goods.stream().mapToInt(e -> (int) (e.getPrice() * (e.getMargin() / (double)100))).sum();


        return new Money(total);
    }
}