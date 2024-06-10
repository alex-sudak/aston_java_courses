public class Cat extends Animal{
    public String name;
    static int count = 0;
    public int hungry;
    public boolean full;

    public Cat(String name, int hungry, boolean full, int swim, int run){
        count++;
        this.name = name;
        this.hungry = hungry;
        this.full = false;
        this.swim = swim;
        this.run = run;
    }

        @Override
        String getName(){
        return name;
        }

        public void feedAdd(Bowl bwl){
        bwl.delFeed(hungry);
        }

        @Override
        void run(int distance){
        if(distance > 200){
            System.out.println("Животное типа 'Кот' " + name + " тяжело пробегать такое расстояние как " + distance + " метров");
        } else {
            System.out.println("Животное типа 'Кот' " + name + " с легкостью пробежал(а) " + distance + " метров");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Животное типа 'Кот' " + name + " вообще-то не умеет плавать");
    }

    public static int getCount(){
        return count;
    }
}