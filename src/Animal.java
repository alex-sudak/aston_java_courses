import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Animal {
    public boolean full;
    public int hungry;
    public int distance;
    static int count;
    public String name;
    protected int swim;
    protected int run;
    public int feed;

    public Animal() {
        count++;
    }

    void run(int distance) {
        System.out.println("Животное бежит " + distance);
    }

    void swim(int distance) {
        System.out.println("Животное плывет " + distance);
    }

    public static int getCount() {
        return count;
    }

    public void feedAdd(Bowl bwl) {
        bwl.delfeed(hungry);
    }
}

class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Василий", 21, false, 0, 200);
        animals[1] = new Cat("Тимоха", 7, false, 0, 200);
        animals[2] = new Cat("Кукуруза", 15, false, 0, 200);
        animals[3] = new Dog("Тузик", 39, false, 10, 500);
        animals[4] = new Dog("Грелка", 28, false, 10, 500);

        System.out.println("Давайте вместе посчитаем, сколько же животных мы создали...");

        for (int i = 0; i < animals.length; i++) {
        }
        System.out.println("Всего котов нами было создано: " + Cat.getCount());
        System.out.println("Всего собак нами было создано: " + Dog.getCount());
        System.out.println("Всего животных (коты + собаки) было создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Урок номер 4 - Задание 1, часть первая 'Бег и плавание котов и собак'");
        System.out.println();
        System.out.println("---Бег---");

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }

        System.out.println();
        System.out.println("---Плавание---");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(10);
        }

        System.out.println();
        System.out.println("Урок номер 4 - Задание 2, часть вторая 'Учим котов кушать из миски'");

        Bowl bowl = new Bowl(40);
        bowl.total();
        for (int i = 0; i < animals.length; i++) {
                    if (animals[i].full == false && animals[i].hungry < bowl.feed) {
                    animals[i].feedAdd(bowl);
                    animals[i].full = true;
                    System.out.println("Пушистый звереныш по имени " + animals[i].name + " хорошо покушал и он сыт");
                } else {
                    System.out.println("Пушистый звереныш по имени " + animals[i].name + " очень голоден и хочет кушать");
                }
            }
            bowl.total();
            System.out.println("Добавьте пожалуйста корма в миску для того чтобы котик покушал - укажите вес корма для добавления");
            action = sc.nextInt();
            bowl.addfeed(action);
            bowl.total();
        }
    }
