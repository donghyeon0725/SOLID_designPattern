package SingleResponsibilityPrinciple;

import SingleResponsibilityPrinciple.Employees.IceCreamSalesmap;
import SingleResponsibilityPrinciple.Employees.Salesperson;
import SingleResponsibilityPrinciple.goods.Book;
import SingleResponsibilityPrinciple.goods.Pen;

public class Main {
    public static void main(String[] args) {
        Salesperson person = new IceCreamSalesmap(1, "kim");

        person.saleGoods(new Pen("삼색 볼펜", 3000));
        person.saleGoods(new Book("자바의 정석", 6000, "자기개발도서"));
        person.saleGoods(new Pen("연필", 500));


        System.out.println(person);
    }
}
