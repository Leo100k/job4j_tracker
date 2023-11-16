package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (k, v) -> map.put(k, v);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (s, i) -> s % 2 == 0 || i.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("Замена условия в IF на Predicate" + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());

        Consumer<String> con = (s) -> System.out.println("Замена for each на Consumer + Function" + s);
        Function<String, String> func = s -> s.toUpperCase();
        List<String> strings = sup.get();
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}