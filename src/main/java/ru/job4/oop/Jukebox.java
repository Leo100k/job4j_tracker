package ru.job4.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        };
    }

    public static void main(String[] args) {
        Jukebox test1 = new Jukebox();
        test1.music(5);
        test1.music(2);
        test1.music(1);
    }
}

