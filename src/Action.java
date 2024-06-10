import java.util.Scanner;

class Action extends Animal {

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
            if (animals[i].full == false && animals[i].hungry <= bowl.feed) {
                System.out.print(animals[i].getName());
                animals[i].feedAdd(bowl);
                animals[i].full = true;
         }
        }
        bowl.total();
        System.out.println("Добавьте пожалуйста корма в миску для того чтобы котик покушал - укажите вес корма для добавления");
        action = sc.nextInt();
        bowl.addFeed(action);
        bowl.total();
    }
}