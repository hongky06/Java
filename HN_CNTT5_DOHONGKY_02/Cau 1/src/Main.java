import java.util.Scanner;

public class Main {

    // PHẦN 1 Chuẩn hóa họ tên
    static String chuanHoaHoTen(String chuoiNhap) {

        if (chuoiNhap == null || chuoiNhap.trim().length() == 0) {
            return "Lỗi: không nhập nội dung";
        }

        String chuoiTam = "";

        for (int chiSo = 0; chiSo < chuoiNhap.length(); chiSo++) {
            char kyTu = chuoiNhap.charAt(chiSo);

            if ((kyTu >= 'a' && kyTu <= 'z') || (kyTu >= 'A' && kyTu <= 'Z') || kyTu == ' ') {
                chuoiTam = chuoiTam + kyTu;
            }
        }


        chuoiTam = chuoiTam.trim();

        while (chuoiTam.contains("  ")) {
            chuoiTam = chuoiTam.replace("  ", " ");
        }

        String ketQua = "";
        boolean laKyTuDauTu = true;

        for (int chiSo = 0; chiSo < chuoiTam.length(); chiSo++) {
            char kyTu = chuoiTam.charAt(chiSo);

            if (kyTu == ' ') {
                ketQua = ketQua + kyTu;
                laKyTuDauTu = true;
            } else {
                if (laKyTuDauTu == true) {
                    ketQua = ketQua + Character.toUpperCase(kyTu);
                    laKyTuDauTu = false;
                } else {
                    ketQua = ketQua + Character.toLowerCase(kyTu);
                }
            }
        }

        return ketQua;
    }
    // PHẦN 2 Tìm ký tự không lặp lại đầu tiên
    static String timKyTuKhongLap(String chuoiNhap) {

        if (chuoiNhap == null || chuoiNhap.length() == 0) {
            return "Lỗi: không nhập nội dung";
        }

        for (int chiSo1 = 0; chiSo1 < chuoiNhap.length(); chiSo1++) {
            char kyTu = chuoiNhap.charAt(chiSo1);
            int soLanXuatHien = 0;

            for (int chiSo2 = 0; chiSo2 < chuoiNhap.length(); chiSo2++) {
                if (chuoiNhap.charAt(chiSo2) == kyTu) {
                    soLanXuatHien = soLanXuatHien + 1;
                }
            }

            if (soLanXuatHien == 1) {
                return String.valueOf(kyTu);
            }
        }

        return "Không tìm thấy";
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Kết quả: " + chuanHoaHoTen(hoTen));


        System.out.print("Nhập chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();
        System.out.println("Kết quả: " + timKyTuKhongLap(chuoi));
    }
}