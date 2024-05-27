public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Name: " + name + ", Position: " + position +
                ", Email " + email + ", Phone " + phone + ", Salary " + salary +
                ", Age " + age);
    }
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Petrov Petr", "PM_Engineer",
                "petrov@mailbox.com", "8925324576", 56000, 56);
        persArray[2] = new Employee("Sidorov Sidr", "QA_Engineer",
                "sidorov@mailbox.com", "897231266", 12300, 39);
        persArray[3] = new Employee("Klimonov Klim", "SM_Engineer",
                "klimov@mailbox.com", "899881212", 99500, 21);
        persArray[4] = new Employee("Hlebov Hleb", "SEO_Engineer",
                "hlebov@mailbox.com", "895556735", 7000, 71);
        for (int i = 0; i < persArray.length; i++) {
            persArray[i].info();
        }
    }
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
    }
}
