package fourthDay.entities;

public class Game {
    private int id;
    private String name;
    private double unitPrice;
    private double discount;
    private double unitPriceAfterDiscount;

    public Game() {
    }

    public Game(int id, String name, double unitPrice, double discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount(int i) {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return (unitPrice - (unitPrice*discount/100));
    }
}
