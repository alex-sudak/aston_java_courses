import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public abstract class Animal {
    public boolean full;
    public int hungry;
    static int count;
    public String name;
    protected int swim;
    protected int run;

    public Animal() {
        count++;
    }

    String getName(){
        return name;
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
        bwl.delFeed(hungry);
    }
}