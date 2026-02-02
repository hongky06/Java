public class Main {
    public static void main(String[] args) {

        User u1 = new User(1, "admin", "123");
        User u2 = new User(2, "user1", "abc");
        User u3 = new User(3, "user2", "456");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(UserManager.checkLogin("admin", "123")); // true
        System.out.println(UserManager.checkLogin("user1", "sai")); // false

    }
}
