import java.util.Scanner;

public class Lection2 {
    public static void main(String[] args) {
        boolean success = false;
        do {
            System.out.println("Пожалуйста введите номер задания Темы 2, которое Вы хотели бы проверить - целое число от 1 до 14");
            Scanner cs = new Scanner(System.in);
            int numberOfTask = cs.nextInt();
            if (numberOfTask == 1) {
                printThreeWords();
            }
            if (numberOfTask == 2) {
                checkSumSign();
            }
            if (numberOfTask == 3) {
                printColor();
            }
            if (numberOfTask == 4) {
                compareNumbers();
            }
            if (numberOfTask == 5) {
                checkAmount();
            }
            if (numberOfTask == 6) {
                mathSign();
            }
            if (numberOfTask == 7) {
                checkMathSign();
            }
            if (numberOfTask == 8) {
                stringAndNumber();
            }
            if (numberOfTask == 9) {
                leapYear();
            }
            if (numberOfTask == 10) {
                changeArray();
            }
            if (numberOfTask == 11) {
                fillingArray();
            }
            if (numberOfTask == 12) {
                lessThanSix();
            }
            if (numberOfTask == 13) {
                fillingDiagonal();
            }
            if (numberOfTask == 14) {
                oneDimensionalArray();
            }
            if (numberOfTask <= 0 | numberOfTask > 15) {
                System.out.println("Вы ввели номер задания, которого не существует, попробуйте снова");
            }
        } while (!success);
    }
    public static void printThreeWords(){
        String a, b, c;
        a = "Orange";
        b = "Banana";
        c = "Apple";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void checkSumSign(){
        System.out.println("Пожалуйста введите цифру 'a'");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        System.out.println("Пожалуйста введите цифру 'b'");
        int b = cs.nextInt();
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        System.out.println("Пожалуйста введите любое число");
        Scanner cs = new Scanner(System.in);
        int value = cs.nextInt();
        if (value > 0 & value < 100) {
            System.out.println("Желтый");
        }
        if (value >= 100) {
            System.out.println("Зеленый");
        }
        if (value <= 0) {
            System.out.println("Красный");
        }
    }
    public static void compareNumbers(){
        System.out.println("Пожалуйста введите цифру 'a'");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        System.out.println("Пожалуйста введите цифру 'b'");
        int b = cs.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void checkAmount() {
        System.out.println("Пожалуйста введите любое целое число");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        System.out.println("Пожалуйста введите любое целое число, чтобы завешить проверку введенных Вами чисел");
        int b = cs.nextInt();
        int c = a + b;
        if (c >= 10 & c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void mathSign() {
        System.out.println("Пожалуйста введите любое целое число в консоль");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        if (a>=0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static void checkMathSign() {
        System.out.println("Пожалуйста введите цифру 'a'");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        if (a > 0) {
            System.out.println(false);
        }
        if (a < 0) {
            System.out.println(true);
        }
        if (a == 0) {
            System.out.println("Вы ввели число '0'");
        }
    }
    public static void stringAndNumber() {
        System.out.println("Пожалуйста введите свой текст");
        Scanner cs = new Scanner(System.in);
        String a = cs.nextLine();
        System.out.println("Пожалуйста введите любое целое положительное число");
        int b = cs.nextInt();
        for(int i = 1; i <= b ; i++){
            System.out.println(a);
        }
    }
    public static void leapYear() {
        System.out.println("Пожалуйста введите год, который Вы хотите проверить");
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = a % 4;
        int c = a % 100;
        int d = a % 400;
        if (a > 0 & b == 0 & c != 0 | d == 0) {
            System.out.println("Введенный Вами год является високосным");
        }
        else {
            System.out.println("Введенный Вами год не является високосным");
        }
    }
    public static void changeArray() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                System.out.print(a[i]);
                continue;
            }
            if (a[i] == 1) {
                a[i] = 0;
                System.out.print(a[i]);
            }
        }
        System.out.println();
    }
    public static void fillingArray() {
        int[] a = new int[100];
        System.out.println("Длина массива до изменения " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Длина массива после изменения " + a.length);
    }
    public static void lessThanSix() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 6) {
                a[i] = a[i]*2;
                System.out.print(a[i]);
                System.out.print(" ");
                continue;
            }
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
    public static void fillingDiagonal() {
        System.out.println("Пожалуйста введите целое число, которое будет определять размер двумерного массива, типа квадрат");
        Scanner cs = new Scanner(System.in);
        int b = cs.nextInt();
        int[][] a = new int[b][b];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j | b - i - 1 == j) {
                    a[i][j] = 1;
                    System.out.print(" " + a[i][j] + " ");
                }
                else
                    System.out.print(" " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void oneDimensionalArray() {
        System.out.println("Пожалуйста введите значение 'initialValue'");
        Scanner cs = new Scanner(System.in);
        String initialValue = cs.nextLine();
        System.out.println("Пожалуйста введите целое число 'len'");
        int len = cs.nextInt();
        String[] a = new String[len];
        System.out.println("Полученный массив длиной " + len + " выглядит следующим образом");
        for (int i = 0; i < len; i++) {
            if (i == len - 1){
                a[i] = initialValue;
                System.out.println(a[i]);
                continue;
            }
            a[i] = initialValue;
            System.out.print(a[i] + " , ");
        }
    }
}