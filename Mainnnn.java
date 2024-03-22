import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

public class Mainnnn {
    public static void main(String[] args) {
        ArrayList<User> usersList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Введите возраст пользователя " + (i+1));
            int age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(name, age);
            usersList.add(user);
        }

        System.out.println("\nОтсортированный список пользователей:");
        Collections.sort(usersList, Comparator.comparing(User::getAge));

        for (User user : usersList) {
            System.out.println(user.toString());
        }
    }
}