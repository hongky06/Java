import java.util.Scanner;
// Thư viện Scanner dùng để nhập dữ liệu từ bàn phím

public class Main {
    public static int[] nhapDanhSachMaSach(int soLuong) {

        Scanner scanner = new Scanner(System.in);
        // Tạo Scanner để đọc dữ liệu

        int[] danhSachMaSach = new int[soLuong];
        // Khởi tạo mảng lưu mã sách

        System.out.println("Nhập mã số cho " + soLuong + " cuốn sách:");

        // Vòng lặp nhập từng mã sách
        for (int i = 0; i < soLuong; i++) {

            System.out.print("Sách thứ " + (i + 1) + ": ");
            // Người dùng nhập mã sách

            danhSachMaSach[i] = scanner.nextInt();
            // Lưu mã sách vào mảng
        }

        // Trả về mảng mã sách sau khi nhập xong
        return danhSachMaSach;
    }

    public static void hienThiDanhSachMaSach(int[] danhSach) {

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");

        // Duyệt qua từng phần tử trong mảng
        for (int i = 0; i < danhSach.length; i++) {

            System.out.print(danhSach[i]);
            // In mã sách hiện tại

            // Nếu chưa phải phần tử cuối thì in thêm dấu phẩy
            if (i < danhSach.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner dùng trong hàm main

        System.out.print("Nhập số lượng sách cần quản lý: ");
        int soLuongSach = scanner.nextInt();
        // Nhập số lượng sách

        // Gọi hàm nhập danh sách mã sách
        int[] danhSachSach = nhapDanhSachMaSach(soLuongSach);

        // Gọi hàm hiển thị danh sách mã sách
        hienThiDanhSachMaSach(danhSachSach);
    }
}