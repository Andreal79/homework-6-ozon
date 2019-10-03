package ru.itpark;

public class Cart {
    //    private int count; // количество товаров в корзине
//    private int amount; // стоимость товаров в корзине
//    private int discountAmount; // стоимотсть товаров в корзине со скидкой
//
//    public int getCount() {
//        return count;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public int getDiscountAmount() {
//        return discountAmount;
//    }
//
//    public void add(Lego lego, int count) {
//        amount = lego.getPrice() * count;
    private int count;
    private int amount;
    private int discountAmount; // стоимотсть товаров в корзине со скидкой

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getAmount() {

        return amount;
    }

    public void add(Lego lego, int count) {
        amount += lego.getPrice() * count;
        discountAmount += lego.getDiscountPrice() * count;


    }

//    public void add(Lego lego, int count) {
//        discountAmount += lego.getDiscountPrice() * count;
//    }

}


