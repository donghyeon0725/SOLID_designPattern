package SingleResponsibilityPrinciple.repository;

import SingleResponsibilityPrinciple.Employees.SocietyPerson;
import SingleResponsibilityPrinciple.goods.Goods;

import java.util.ArrayList;
import java.util.List;

class RepositoryImpl implements Repository{
    private static List<Goods>[] repository = new ArrayList[10];

    public RepositoryImpl() {}

    public List<Goods> getAllGoods(SocietyPerson employee) {
        return repository[employee.getUserID()];
    }

    public void save(SocietyPerson employee, Goods goods) {
        if (repository[employee.getUserID()] == null) {
            repository[employee.getUserID()] = new ArrayList<>();
        }

        // 사원 저장소에 판매 물품 추가
        repository[employee.getUserID()].add(goods);
    }
}