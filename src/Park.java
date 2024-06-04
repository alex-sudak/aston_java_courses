public class Park {
    public static class Attractions {
        private String name;
        private String time;
        private int price;
        private int number;
        private Attractions[] attractions;

        public Attractions(int number, String name, String time, int price) {
            this.number = number;
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public Attractions[] attractions () {
            attractions[0] = new Park.Attractions(1, "Колесо обозрения", "8:00 - 19:00", 3);
            attractions[1] = new Park.Attractions(2, "Лодочка", "9:00 - 19:00", 5);
            attractions[2] = new Park.Attractions(3, "Супер8", "8:00 - 18:30", 7);
            attractions[3] = new Park.Attractions(4, "Вальс", "8:30 - 17:30", 4);
            return attractions();
        }

        public void setAttractions(Attractions[] attractions){
            this.attractions = attractions;
        }

        public Attractions[] getAttractions(){
            return attractions();
        }

        public int getNumber() {
            return number;
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

        public void setNumber(int number) {
            this.number = number;
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

        public void parkInfo() {
            System.out.println("Информация об аттракционе номер : " + number);
            System.out.println("Название: " + name);
            System.out.println("Стоимость(руб): " + price);
            System.out.println("Время работы: " + time);
            System.out.println();
        }
    }
    }