package SingleResponsibilityPrinciple.two.repository;
import SingleResponsibilityPrinciple.two.goods.Goods;
import SingleResponsibilityPrinciple.two.Salesperson;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 저장할 사원은 혼자가 아니다.
 * 2. 저장 기능
 * 3. 저장한 값을 가져오는 기능 필요
 * */
class RepositoryImpl implements Repository {
    private static List<Goods>[] repository = new ArrayList[10];


    public List<Goods> getAllGoods(Salesperson salesperson) {
        return repository[salesperson.getId()];
    }

    public void save(Salesperson salesperson, Goods goods) {
        /**
         * 저장 배열 안에, 저장소가 없는 경우 저장소 생성
         * */
        if (repository[salesperson.getId()] == null) {
            repository[salesperson.getId()] = new ArrayList<>();
        }

        // 사원 저장소에 판매 물품 추가
        repository[salesperson.getId()].add(goods);
    }
}
