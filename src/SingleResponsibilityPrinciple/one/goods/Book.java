package SingleResponsibilityPrinciple.one.goods;

public class Book implements Goods {
    private String name;
    private String category;
    private Integer price;
    private final int margin = 30;

    public Book(String name, Integer price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int getMargin() {
        return margin;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
