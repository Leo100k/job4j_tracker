package ru.job4.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String phrase = dic.engToRus("What ?");
        System.out.println(phrase);
    }
}