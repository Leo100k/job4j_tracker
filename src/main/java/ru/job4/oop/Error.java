package ru.job4.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorRealised = new Error(true, 500, "Хорошо");
        Error errorRealised1 = new Error(true, 1000, "Средне");
        Error errorRealised2 = new Error(true, 1500, "Устал");
        errorRealised.printInfo();
        errorRealised1.printInfo();
        errorRealised2.printInfo();
    }

}
