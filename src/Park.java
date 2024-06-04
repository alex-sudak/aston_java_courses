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

        public int getNumber() { return number; }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public int getPrice() {
            return price;
        }

        public void setNumber(int number) { this.number = number; }

        public void setTime(String time) {
            this.time = time;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}