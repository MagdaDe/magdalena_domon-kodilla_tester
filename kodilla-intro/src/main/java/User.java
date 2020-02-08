public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static int sumOfAges(User[] users) {
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result += users[i].getAge();
        }
        return result;
    }

    public static int averageAge(User[] users) {
        return sumOfAges(users) / users.length;
    }

    public static void main(String[] args) {
        User young = new User ("Nikodem", 15);
        User student = new User ("Majka", 21);
        User dad = new User ("Tymoteusz", 40);
        User mom = new User ("Kinga", 38);
        User baby = new User ("Szymek", 1);
        User grandpa = new User ("Mieczysław", 65);
        User grandma = new User ("Izabela", 58);

        User[] users = {young, student, dad, mom, baby, grandpa, grandma};

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < averageAge(users)) {
                System.out.println(users[i].getName());
            }
        }
    }
}