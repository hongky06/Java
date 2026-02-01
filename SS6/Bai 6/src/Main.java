class User{
    private String id, username, password, email;
    public User(String id,String username, String password, String email){
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }
    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Password không được rỗng!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ!");
        }
    }
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("--------------------");
    }

}
public class Main {
    public static void main(String[] args) {
        User u1 = new User("1", "admin", "123456", "admin@gmail.com");
        u1.hienThiThongTin();
        User u2 = new User("2", "user01", "abcdef", "user01gmail.com");
        u2.hienThiThongTin();
        User u3 = new User("3", "user02", "", "user02@gmail.com");
        u3.hienThiThongTin();
    }

}