package SingleResponsibilityPrinciple.goods;

public class Pen implements Goods{
    private String name;
    private final int margin = 10;
    private Integer price;

    public Pen(String name, Integer price) {
        this.name = name;
        this.price = price;
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
