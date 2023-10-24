package ru.job4j.tracker;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.println("СРАБОТАЛ askSTR");
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        System.out.println("СРАБОТАЛ askInt");
        return Integer.parseInt(askStr(question));
    }
}
