package SingleResponsibilityPrinciple.two.repository;

import SingleResponsibilityPrinciple.two.goods.Goods;
import SingleResponsibilityPrinciple.two.Salesperson;

import java.util.List;

public interface Repository {
    public List<Goods> getAllGoods(Salesperson salesperson);
    public void save(Salesperson salesperson, Goods goods);
}
