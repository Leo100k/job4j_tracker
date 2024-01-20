package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Output out;
    private final Input input;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        int n = 0;
        do {
            try {
                value = input.askInt(question);
                System.out.println(value);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Пожалуйста, введите корректные данные");
            }
            n++;
        } while (invalid);
        return value;
    }
}
