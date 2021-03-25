package SingleResponsibilityPrinciple.one;

import SingleResponsibilityPrinciple.one.goods.*;

public class Main {
    public static void main(String[] args) {
        Salesperson person = new Salesperson();

        person.saleGoods(new Pen("삼색 볼펜", 3000));
        person.saleGoods(new Book("자바의 정석", 6000, "자기개발도서"));
        person.saleGoods(new Pen("연필", 500));

        System.out.println(person);
    }
}
