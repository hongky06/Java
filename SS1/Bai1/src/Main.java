//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        // bước 1 : tạo một đối tượng để nhaapj
//        Scanner input =  new Scanner(System.in);
////       Scanner : dùng để nhập dữ liệu từ bàn phím
//
//
//        System.out.printf ("nhap mã sách : ");
//        String Ma_sach = input.nextLine();
//        System.out.println("Tên bạn là: " + Ma_sach);
//
//        System.out.printf("nhập tên sách");
//        String tensach = input.nextLine();
//        System.out.printf(tensach);
//
//        System.out.printf("nhập năm xuất bản");
//        int Nam_xuat_ban = Integer.parseInt(input.nextLine());
//        System.out.println(Nam_xuat_ban);
//
//        System.out.println("Nhập giá sách");
//        Float gia_sach = input.nextFloat();
//        System.out.println(gia_sach);
//
//        System.out.printf("sách còn lại trong kho (true / false)");
//        float so_luong_trong_kho = input.nextFloat();
//        System.out.println(so_luong_trong_kho);
//
//
//
//    }
//}

//--------------------------------------------------------------------------------

import java.util.Scanner;

// Lớp Book
class Book {
    String maSach;
    String tenSach;
    int namXuatBan;
    float giaSach;
    boolean conTrongKho;


    void nhapThongTin(Scanner input) {
        System.out.print("Nhập mã sách: ");
        maSach = input.nextLine();

        System.out.print("Nhập tên sách: ");
        tenSach = input.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = Integer.parseInt(input.nextLine());

        System.out.print("Nhập giá sách: ");
        giaSach = Float.parseFloat(input.nextLine());

        System.out.print("Sách còn trong kho? (true / false): ");
        conTrongKho = Boolean.parseBoolean(input.nextLine());
    }


    void hienThiThongTin() {
        System.out.println("\n===== THÔNG TIN SÁCH =====");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Giá sách: " + giaSach);
        System.out.println("Còn trong kho: " + (conTrongKho ? "Có" : "Không"));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book sach = new Book();
        sach.nhapThongTin(input);
        sach.hienThiThongTin();
    }
}