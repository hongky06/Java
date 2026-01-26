import java.util.Scanner;

class check {
    int so_luong_sach_muon  ;
    int count = 0 ;
    int temp = 0;

    void nhap (Scanner sc) {
        System.out.printf("số lượng sách mượn : ");
        so_luong_sach_muon = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= so_luong_sach_muon; i++) {
            System.out.printf("Nhập số ngày trễ của cuốn sách thứ i ");
            temp = Integer.parseInt(sc.nextLine());
            if (temp > 0) {
                count += temp;
                temp = 0;
            }
        }
        count *= 5000;
        System.out.printf(count + "\n");
    }

}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        check check = new check();
        check.nhap(sc);
    }
}