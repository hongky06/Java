public class User {
    public final int id;
    public String username;
    public String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "User{id=" + id + ", username='" + username + "'}";
    }
}
