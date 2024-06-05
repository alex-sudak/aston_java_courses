import java.util.Arrays;

class ParkInfo {
    public static void main(String[] args) {

        Park.Attractions[] attractions = new Park.Attractions[4];

        for (int i = 0; i < attractions.length; i++) {
            attractions[i].attractionInfo();
//            System.out.println(attractions[i].attractionInfo());
//            System.out.println("Информация об аттракционе номер : " + attractions[i].attractioninfo()
//            System.out.println("Название: " + attr[i].getName());
//            System.out.println("Стоимость(руб): " + attr[i].getPrice());
//            System.out.println("Время работы: " + attr[i].getTime());
//            System.out.println();
        }
    }
}