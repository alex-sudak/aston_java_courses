public class Parkcheluskincev {
    public static class Attractions {
        private String name;
        private String time;
        private int price;
        public Attractions(String name, String time, int price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public String getTime() {
            return time;
        }
        public int getPrice() {
            return price;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void setName(String name) {
            this.name = name;
        }
        public static void main(String[] args) {
            Parkcheluskincev park = new Parkcheluskincev();
            Parkcheluskincev.Attractions attraction1 = new Parkcheluskincev.Attractions("Колесо обозрения", "8:00 - 19:00", 3);
            Parkcheluskincev.Attractions attraction2 = new Parkcheluskincev.Attractions("Лодочка", "9:00 - 19:00", 5);
            System.out.println("Информация об аттракционе номер 1: ");
            System.out.println("Название: " + attraction1.getName());
            System.out.println("Стоимость(руб): " + attraction1.getPrice());
            System.out.println("Время работы: " + attraction1.getTime());
            System.out.println();
            System.out.println("Информация об аттракционе номер 2: ");
            System.out.println("Название: " + attraction2.getName());
            System.out.println("Стоимость(руб): " + attraction2.getPrice());
            System.out.println("Время работы: " + attraction2.getTime());
        }
    }
}