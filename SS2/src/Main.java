import java.util.Scanner;


class User {
    int tuoi;
    int soSachDangMuon;


    void nhap(Scanner sc) {
        System.out.print("Nhap tuoi cua ban: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so sach dang muon: ");
        soSachDangMuon = Integer.parseInt(sc.nextLine());
    }
    void kiemTraDieuKien() {
        int trangThai;


        if (tuoi < 18) {
            trangThai = 1;
        } else if (soSachDangMuon > 3) {
            trangThai = 2;
        } else {
            trangThai = 3;
        }


        switch (trangThai) {
            case 1:
                System.out.println("Ket qua: Khong du dieu kien.");
                System.out.println("- Ly do: Ban phai tu 18 tuoi tro len.");
                break;
            case 2:
                System.out.println("Ket qua: Khong du dieu kien.");
                System.out.println("- Ly do: Ban da muon toi da 3 cuon.");
                break;
            case 3:
                System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
                break;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User u = new User();
        u.nhap(sc);
        u.kiemTraDieuKien();
    }
}