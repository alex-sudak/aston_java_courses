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
}

    class Main{
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
}