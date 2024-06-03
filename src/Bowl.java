public class Bowl {
    public int feed;

    public Bowl(int feed){
        this.feed = feed;
    }
    public void addfeed(int add){
        feed = feed + add;
    }
    public void delfeed(int del){
        feed = feed - del;
    }
    public void total(){
        System.out.println("Еды в миске осталось: " + feed);
    }
}