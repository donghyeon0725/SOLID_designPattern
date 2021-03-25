package SingleResponsibilityPrinciple.last;

import SingleResponsibilityPrinciple.last.person.IceCreamSalesmap;
import SingleResponsibilityPrinciple.last.person.Salesperson;
import SingleResponsibilityPrinciple.last.goods.Book;
import SingleResponsibilityPrinciple.last.goods.Pen;
import SingleResponsibilityPrinciple.last.person.You;

public class Main {
    public static void main(String[] args) {
        Salesperson person = new IceCreamSalesmap(1);
        Salesperson you = new You(2);

        person.saleGoods(new Pen("삼색 볼펜", 3000));
        person.saleGoods(new Book("자바의 정석", 6000, "자기개발도서"));
        person.saleGoods(new Pen("연필", 500));

        you.saleGoods(new Pen("삼색 볼펜", 3000));
        you.saleGoods(new Book("미래 경영", 10000, "증권사"));
        you.saleGoods(new Book("인류의 진화", 23000, "역사"));

        System.out.println(person);
        System.out.println(you);
    }
}
