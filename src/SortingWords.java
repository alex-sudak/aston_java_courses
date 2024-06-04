import java.util.HashMap;
import java.util.Map;

public class SortingWords {
    public static void main(String[] args){
        Map<String, Integer> sort = new HashMap<>();
        String[] values = new String[15];
        values[0] = "Часы";
        values[1] = "Стол";
        values[2] = "Дом";
        values[3] = "Ухо";
        values[4] = "Дом";
        values[5] = "Дом";
        values[6] = "Нос";
        values[7] = "Часы";
        values[8] = "Цветы";
        values[9] = "Борода";
        values[10] = "Ухо";
        values[11] = "Пусто";
        values[12] = "Часы";
        values[13] = "Стол";
        values[14] = "Борода";

        for(int i = 0; i < values.length; i++){
            if (sort.containsKey(values[i])) {
                sort.put(values[i], sort.get(values[i]) + 1);
            } else {
                sort.put(values[i], 1);
            }
        }
        System.out.println("Система обработала Ваши слова и результат обработки Вы можете видеть ниже в консоли...");
        System.out.println(sort);
    }
}
