package ru.itpark;

public class Cart {
    private int count;
    private int amount;
    private int discountAmount;

    public int getCount() {
        return count;
    }

    public int getAmount() {
        return amount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void add(Lego lego, int count) {
        amount += lego.getPrice() * count;
    }
}
