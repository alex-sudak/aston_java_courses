import javax.swing.*;

public class Bowl extends Animal {
    public int feed;

    public Bowl(int feed){
        this.feed = feed;
    }

    public void addFeed(int amount){
        feed = feed + amount;
    }

    public void delFeed(int amount){
        if(feed >= amount){
           feed = feed - amount;
       System.out.println(" хорошо покушал и он сыт");
        } else {
           System.out.println(" остался голодным так как для него в миске не достаточно еды");
        }
    }

    public void total(){
        System.out.println("Еды в миске осталось: " + feed);
    }
}