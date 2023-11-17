package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.lang.Math.pow;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rez = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rez.add(func.apply((double) i));
        }
        return rez;
    }

}