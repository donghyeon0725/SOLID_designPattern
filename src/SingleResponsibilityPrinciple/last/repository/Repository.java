package SingleResponsibilityPrinciple.last.repository;


import SingleResponsibilityPrinciple.last.goods.Goods;
import SingleResponsibilityPrinciple.last.person.Salesperson;

import java.util.List;

public interface Repository {
    public List<Goods> getAllGoods(Salesperson person);

    public void save(Salesperson person, Goods goods);
}
