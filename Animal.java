import java.util.Scanner;

public class Animal {
    protected int distance;
    static int count;
    protected String name;
    protected int swim;
    protected int run;

    public Animal(){
        count++;
    }

    void Run(int distance){
        System.out.println("Животное бежит " + distance);
    }
    void Swim(int distance){
        System.out.println("Животное плывет " + distance);
    }
    public static int getCount(){
        return count;
    }
}

class Cat extends Animal{
    String name;
    static int count = 0;
    public Cat(String name){
        super();
        count++;
        this.name = name;
    }

    @Override
    void Run(int distance){
    if(distance > 200){
        System.out.println("Животное типа 'Кот' " + name + " тяжело пробегать такое расстояние как " + distance + " метров");
    } else {
        System.out.println("Животное типа 'Кот' " + name + " с легкостью пробежал(а) " + distance + " метров");
    }
}
    @Override
    void Swim(int distance) {
        System.out.println("Животное типа 'Кот' " + name + " вообще-то не умеет плавать");
    }

    public static int getCount(){
        return count;
    }
}

class Dog extends Animal{
    String name;
    static int count = 0;
    public Dog(String name){
        super();
        count++;
        this.name = name;
    }
    @Override
    void Run(int distance){
        if(distance > 500){
            System.out.println("Животное типа 'Собака' " + name + " не может пробегать такое большое расстояние в " + distance + " метр(ов)");
        } else {
            System.out.println("Животное типа 'Собака' " + name + " справил(ся/ась) с дистанцией и пробежал(а) " + distance + " метр(ов)");
        }
    }
    @Override
    void Swim(int distance){
        if(distance > 10){
            System.out.println("Животное типа 'Собака' " + name + " не может плавать такое расстояние как " + distance + " метр(ов)");
        } else {
            System.out.println("Животное типа 'Собака' " + name + " успешно проплыла " + distance + " метр(ов)");
        }
    }

    public static int getCount(){
        return count;
    }
}

class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println("Укажите имя КОТА, которое Вам нравится");
        Scanner cs = new Scanner(System.in);
        String catname = cs.nextLine();
        System.out.println("Укажите имя СОБАКИ, которое Вам нравится");
        String dogname = cs.nextLine();
        Cat name1 = new Cat(catname);
        Dog name2 = new Dog(dogname);
        System.out.println("Укажите дистанцию в метрах, которую Вы бы хотели чтобы ПРОБЕЖАЛ КОТ по имени " +catname);
        int a = cs.nextInt();
        System.out.println("Укажите дистанцию в метрах, которую Вы бы хотели чтобы ПРОБЕЖАЛА СОБАКА по имени " +dogname);
        int b = cs.nextInt();
        System.out.println("Укажите дистанцию в метрах, которую Вы бы хотели чтобы ПРОПЛЫЛ КОТ по имени " +catname);
        int c = cs.nextInt();
        System.out.println("Укажите дистанцию в метрах, которую Вы бы хотели чтобы ПРОПЛЫЛА СОБАКА по имени " +dogname);
        int d = cs.nextInt();
        name1.Run(a);
        name2.Run(b);
        name1.Swim(c);
        name2.Swim(d);
        System.out.println("Всего животных было использовано в эксперименте " + Animal.getCount());
        System.out.println("Всего котов понадобилось " + Cat.getCount());
        System.out.println("Всего собак понадобилось " + Dog.getCount());

    }
}

