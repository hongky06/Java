import java.util.Scanner;

public class Main {
    public static String nhaptenphimcantim (Scanner sc) {
        System.out.println("Nhap phim can tim : ");
        return sc.next();
    }

   public static int Tim (String[] danhsach , String tenphim) {
        for (int i = 0; i < danhsach.length; i++) {
            if (danhsach[i].equals(tenphim)) {
                return i;
            }
        };
        return -1;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] danhsach = {"AB" , "BC" , "CD"};
        String tenphim = nhaptenphimcantim(sc);
        int vitri = Tim(danhsach, tenphim);
        if (vitri == -1) {
            System.out.println("không tồn tại");
        }else {
            System.out.println(vitri);
        }

    }
}