public class Main {
    public static class Account {
        String username;
        String password;
        String email;


        public Account (  String username, String password, String email){
            this.username = username;
            this.password = password;
            this.email = email;

            System.out.println("Nam sinh: " + username);
        }


        public void doimatkhau(String mkmoi){
            this.password = mkmoi;
            System.out.println("doi mật khẩu mới thành công " + mkmoi);
        }

        public void hienthi() {
            System.out.println("Nam sinh: " + username);
            System.out.println("Password sinh: " + password);
            System.out.println("Email sinh: " + email);
        }




    }

    public static void main(String[] args) {
        Account accnew = new Account("do hong ky" , "0984063626" ,"dohongky@gmail.com");
        accnew.doimatkhau("dohong ky");
        accnew.hienthi();
    }
}