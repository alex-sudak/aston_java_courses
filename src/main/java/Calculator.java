public class Calculator {
    public static long calculate(int digital) {
        if (digital == 0) {
        return 1;
    }

        if (digital< 0) {
        throw new IllegalArgumentException("Вы ввели отрицательное число - для расчета факториала число должно быть больше либо равно нуля");
    }
        long factorial = 1;
        for (int i = 1; i <= digital; i++) {
            factorial = factorial * i;
        }

        return factorial;

    }
}
