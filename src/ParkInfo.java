import java.util.Arrays;

class ParkInfo {
    public static void main(String[] args) {

        Park park = new Park(4);

        Park.Attraction attraction1 = park.new Attraction( "Колесо обозрения", "8:00 - 19:00", 3);
        park.addAttraction(attraction1);

        Park.Attraction attraction2 = park.new Attraction( "Лодочка", "9:00 - 19:00", 5);
        park.addAttraction(attraction2);

        Park.Attraction attraction3 = park.new Attraction( "Супер8", "8:00 - 18:30", 7);
        park.addAttraction(attraction3);

        Park.Attraction attraction4 = park.new Attraction( "Вальс", "8:30 - 17:30", 4);
        park.addAttraction(attraction4);

        park.attractionInfo();
        }
    }