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
                checkAmount(5, 7);
            }
            if (numberOfTask == 6) {
                mathSign(-6);
            }
            if (numberOfTask == 7) {
                checkMathSign(10);
            }
            if (numberOfTask == 8) {
                stringAndNumber("Пусто", 5);
            }
            if (numberOfTask == 9) {
                leapYear(1984);
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
                oneDimensionalArray(5, "ABC");
            }
            if (numberOfTask <= 0 | numberOfTask > 15) {
                System.out.println("Вы ввели номер задания, которого не существует, попробуйте снова");
            }
        } while (!success);
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
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
    public static boolean checkAmount(int a, int b) {
            int c = a + b;
            if (c >= 10 & c <= 20)
                return true;
            else return false;
    }
    public static void mathSign(int a) {
        if (a>=0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static boolean checkMathSign(int a) {
        if (a < 0) return true;
        else return false;
    }
    public static void stringAndNumber(String a, int b) {
        for(int i = 1; i <= b ; i++){
            System.out.println(a);
        }
    }
    public static boolean leapYear(int a) {
        int b = a % 4;
        int c = a % 100;
        int d = a % 400;
        if (a > 0 && b == 0 && c != 0 || d == 0)
            return true;
        else return false;
    }
    public static void changeArray() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                System.out.print(a[i]);
            } else {
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
                else {
                    System.out.print(" " + a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void oneDimensionalArray(int len, String initialValue) {
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