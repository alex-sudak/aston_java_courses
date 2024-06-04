class ParkInfo {
    public static void main(String[] args) {
        Park.Attractions[] attractions = new Park.Attractions[4];
        attractions[0] = new Park.Attractions(1, "Колесо обозрения", "8:00 - 19:00", 3);
        attractions[1] = new Park.Attractions(2, "Лодочка", "9:00 - 19:00", 5);
        attractions[2] = new Park.Attractions(3, "Супер8", "8:00 - 18:30", 7);
        attractions[3] = new Park.Attractions(4, "Вальс", "8:30 - 17:30", 4);
        for (int i = 0; i < attractions.length; i++) {
            System.out.println("Информация об аттракционе номер : " + attractions[i].getNumber());
            System.out.println("Название: " + attractions[i].getName());
            System.out.println("Стоимость(руб): " + attractions[i].getPrice());
            System.out.println("Время работы: " + attractions[i].getTime());
            System.out.println();
        }
    }
}