import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phonebook = new HashMap<>();
    private List<String> phonelist;

    public void add(String surname, String phone_number) {
        if (phonebook.containsKey(surname)) {
            phonelist = phonebook.get(surname);
            phonelist.add(phone_number);
            phonebook.put(surname, phonelist);
        } else {
            phonelist = new ArrayList<>();
            phonelist.add(phone_number);
            phonebook.put(surname, phonelist);
        }
    }

    public List<String> get(String surname) {
        return phonebook.get(surname);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Павел", "293456871");
        phoneBook.add("Дмитрий", "294560101");
        phoneBook.add("Алиса", "297651029");
        phoneBook.add("Георгий", "297583612");
        phoneBook.add("Алиса", "254652873");
        phoneBook.add("Татьяна", "219829898");
        phoneBook.add("Павел", "172345678");
        phoneBook.add("Дмитрий", "257943456");
        phoneBook.add("Ульяна", "298023402");
        phoneBook.add("Татьяна", "295097845");
        phoneBook.add("Сергей", "172984610");
        phoneBook.add("Владимир", "292101010");
        phoneBook.add("Ульяна", "445021394");
        phoneBook.add("Наталья", "337120505");
        phoneBook.add("Павел", "225347600");

        System.out.println("Павел: " + phoneBook.get("Павел"));
        System.out.println("Дмитрий: " + phoneBook.get("Дмитрий"));
        System.out.println("Алиса: " + phoneBook.get("Алиса"));
        System.out.println("Татьяна: " + phoneBook.get("Татьяна"));
    }
}