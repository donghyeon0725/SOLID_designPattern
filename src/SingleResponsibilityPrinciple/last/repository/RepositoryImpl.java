package SingleResponsibilityPrinciple.last.repository;

import SingleResponsibilityPrinciple.last.person.Salesperson;
import SingleResponsibilityPrinciple.last.goods.Goods;

import java.util.ArrayList;
import java.util.List;

class RepositoryImpl implements Repository{
    private static List<Goods>[] repository = new ArrayList[10];

    public RepositoryImpl() {}

    public List<Goods> getAllGoods(Salesperson person) {
        return repository[person.getID()];
    }

    public void save(Salesperson person, Goods goods) {
        if (repository[person.getID()] == null) {
            repository[person.getID()] = new ArrayList<>();
        }

        // 사원 저장소에 판매 물품 추가
        repository[person.getID()].add(goods);
    }
}