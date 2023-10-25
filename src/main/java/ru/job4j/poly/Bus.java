package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Едем далеко!!!");

    }

    @Override
    public void passengers(int quantityPassengers) {
        System.out.println("Пассажиров в автобусе много " + quantityPassengers);
    }

    @Override
    public double fuel(int quantityFuel) {
        double price = 15;
        return price;
    }
}
