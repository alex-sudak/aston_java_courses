package org.example;

public class Calculator {

    public long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Вы ввели отрицательное число - факториал может быть рассчитан только для чисел, которые больше нуля, либо равны нулю");
        }

        if (n == 0) {
            return 1;
        }
        long amount = 1;
        for (int i = 1; i <= n; i++) {
            amount = amount * i;
        }
        return amount;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        for (int i = 0; i < 5; i++) {
            System.out.println("Факториал числа " + i + " равен " + calculator.factorial(i));
        }
    }
}