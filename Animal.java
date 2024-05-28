public class Animal {
    protected int distance;
    protected int count;
    protected String name;
    protected int swim;
    protected int run;

    public Animal(){
        count++;
    }

    void Run(){
        System.out.println("Животное бежит " + distance);
    }
    void Swim(){
        System.out.println("Животное плывет " + distance);
    }
}

public class Cat extends Animal{
    int count = 0;
    public Cat(String name, int swim, int run){
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    @Override
    void Run(int distance){
    if(distance > 200){
        System.out.println("Животное типа 'Кот'" + name + " не может пробегать такое расстояние " + distance);
    } else {
        System.out.println("Животное типа 'Кот' " + name + " пробежало " + distance + " метров");
    }
}
    @Override
    void Swim(int distance) {
        System.out.println("Животное типа 'Кот'" + name + " не умеет плавать");
    }

    public int getCount(){
        return count;
    }
}

public class Dog extends Animal{
    int count = 0;
    public Dog(String name, int swim, int run){
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    @Override
    void Run(int distance){
        if(distance > 500){
            System.out.println("Животное типа 'Собака'" + name + " не может пробегать такое расстояние " + distance);
        } else {
            System.out.println("Животное типа 'Собака' " + name + " пробежало " + distance + " метров");
        }
    }
    @Override
    void Swim(int distance){
        if(distance > 10){
            System.out.println("Животное типа 'Собака'" + name + " не может плавать такое расстояние " + distance);
        } else {
            System.out.println("Животное типа 'Собака' " + name + " проплыло " + distance + " метров");
        }
    }

    public int getCount(){
        return count;
    }
}

public Class Main{
    public static void main(String[] args){
        Animal animal = new Animal();

    }
        }

