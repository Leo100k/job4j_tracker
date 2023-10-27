package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key == value[i]) {
                rsl = i;
            }
        }
        throw new ElementNotFoundException("Element Not Found");
    }

    public static void main(String[] args) {
        String[] box = {"сто", "двести", "тристо", "четыресто"};
        try {
            indexOf(box, "ничего");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
