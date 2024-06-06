public class Park {
    private String name;
    private String time;
    private int price;
    private Attraction[] attractions;
    private int attrCount;

    public Park(int count){
        attractions = new Attraction[count];
        attrCount = 0;
    }

    public void addAttraction(Attraction attraction){
        if (attrCount < attractions.length) {
            attractions[attrCount] = attraction;
            attrCount++;
        } else {
            System.out.println("Больше аттракционов нельзя создавать");
        }
    }

    public void attractionInfo(){
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                System.out.println(attraction);
            }
        }
    }

    public class Attraction {
        private String name;
        private String time;
        private int price;

        public Attraction(String name, String time, int price) {
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

        @Override
        public String toString() {
        return
                "Название аттракциона: '" + name +
                "' | Время работы: " + time +
                " | Стоимость: " + price + " бел.руб.";
        }
    }
}