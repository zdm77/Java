import java.util.ArrayList;

public class Users {

    public ArrayList<User> arrUsers = new ArrayList<>();

    public Users() {
        arrUsers.add(new User("Иванов Иван Иванович", 25));
        arrUsers.add(new User("Петров Петр Иванович", 30));
        arrUsers.add(new User("Сидров Иван Сидорович", 40));

    }

    public void printUsers() {
        for (User a : arrUsers) {
            System.out.println("Пользователь: " + a.name + ". Возраст - " + a.age);
        }
    }


}
