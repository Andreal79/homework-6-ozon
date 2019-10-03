package ru.itpark;

public class Main {
    public static void main(String[] args) {

        Lego legoOne = new Lego(

                70419,
                "Lego Hidden Side. Старый рыбацкий корабль. Конструктор",
                "https://ozon.ru",
                2299,
                1563,
                true
        );
        Lego legoTwo = new Lego(
                70420,
                "Lego Hidden Side. Загадка старого кладбища. Конструктор",
                "https://ozon.ru",
                2299,
                1540,
                true
        );
        Lego legoThree = new Lego(
                70421,
                "Lego Hidden Side. Трюковый грузовик Эль-Фуэго. Конструктор",
                "https://ozon.ru",
                2299,
                2039,
                true
        );

        Cart cart = new Cart();
        cart.add(legoOne, 1);
        cart.add(legoTwo, 1);
        cart.add(legoThree, 1);

        System.out.println(cart.getAmount());
        System.out.println(cart.getDiscountAmount());
        System.out.println(cart.getCount());


    }
}
