class Dog extends Animal {
    public String name;
    static int count = 0;
    public int hungry;
    public boolean full;

    public Dog(String name, int hungry, boolean full, int swim, int run){
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

    @Override
    void run(int distance){
        if(distance > 500){
            System.out.println("Животное типа 'Собака' " + name + " не может пробегать такое большое расстояние в " + distance + " метр(ов)");
        } else {
            System.out.println("Животное типа 'Собака' " + name + " справил(ся/ась) с дистанцией и пробежал(а) " + distance + " метр(ов)");
        }
    }

    @Override
    void swim(int distance){
        if(distance > 10){
            System.out.println("Животное типа 'Собака' " + name + " не может плавать такое расстояние как " + distance + " метр(ов)");
        } else {
            System.out.println("Животное типа 'Собака' " + name + " успешно проплыла " + distance + " метр(ов)");
        }
    }

    public void feedAdd(Bowl bwl){
        bwl.delFeed(hungry);
    }

    public static int getCount() {
        return count;
    }
}