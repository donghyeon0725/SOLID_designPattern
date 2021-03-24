package SingleResponsibilityPrinciple.repository;

import SingleResponsibilityPrinciple.Employees.SocietyPerson;
import SingleResponsibilityPrinciple.goods.Goods;

import java.util.List;

public interface Repository {
    public List<Goods> getAllGoods(SocietyPerson employee);

    public void save(SocietyPerson employee, Goods goods);
}
