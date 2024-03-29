package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        System.out.println("Selected " + selected);
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(5);
    }

    @Test
    public void whenValidIMultiplenput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "5"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        System.out.println("Селектед  " + selected);
        assertThat(selected).isEqualTo(5);

        in = new StubInput(
                new String[]{"3"}
        );
        input = new ValidateInput(out, in);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(3);
        in = new StubInput(
                new String[]{"1"}
        );
        input = new ValidateInput(out, in);
        selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenInvalidNegativelenput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }

}
/*
Меню:
0. Добавить новую заявку
1. Добавить новую заявку
2. Показать все заявки
3. Изменить заявку
4. Удалить заявку
5. Показать заявку по id
6. Показать заявки по имени
7. Завершить программу
 */