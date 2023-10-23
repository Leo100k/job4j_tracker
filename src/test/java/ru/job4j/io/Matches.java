package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {

            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " спичек осталось: " + count);
            System.out.println(player + " введите число от 1 до 3, но не более остатка спичек: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches < 4 && matches > 0 && matches <= count) {
                turn = !turn;
            count -= matches;
            } else {
                System.out.println(player + " вы ввели не верное число");
            }
            /* Остальная логика игры. */
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
