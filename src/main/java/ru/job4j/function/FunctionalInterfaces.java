package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biCon = (s, s1) -> System.out.println(s + " " + s1);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPred = (s, i) -> s % 2 == 0 || i.length() == 4;
        for (Integer i : map.keySet()) {
            System.out.println("Результат : " + biPred.test(i, map.get(i)));
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());

        Consumer<String> con = (s) -> System.out.println("Замена for each на Consumer" + s);
        con.accept(String.valueOf(sup.get()));
        Function<String, String> func = s -> s.toUpperCase();
        System.out.println("Заглавные символы: " + func.apply(String.valueOf(sup.get())));
    }
}