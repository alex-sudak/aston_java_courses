class MainEmployee {
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