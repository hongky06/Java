import java.util.Scanner;

public class Main {

    // PHẦN 1: Xóa phần tử theo vị trí
    static void xoaPhanTu(int[] mang, int soPhanTu, int viTriXoa) {

        if (viTriXoa >= 0 && viTriXoa < soPhanTu) {

            for (int i = viTriXoa; i < soPhanTu - 1; i++) {
                mang[i] = mang[i + 1];
            }

            for (int i = 0; i < soPhanTu - 1; i++) {
                System.out.print(mang[i] + " ");
            }
            System.out.println();

        } else {
            System.out.println("Vị trí không hợp lệ");
        }
    }

    // PHẦN 2: Tìm số còn thiếu
    static int timSoConThieu(int[] mang, int soPhanTu) {

        int soLonNhat = mang[0];
        int soNhoNhat = mang[0];

        for (int i = 1; i < soPhanTu; i++) {
            if (mang[i] > soLonNhat) {
                soLonNhat = mang[i];
            } else {
                if (mang[i] < soNhoNhat) {
                    soNhoNhat = mang[i];
                }
            }
        }

        int tongDayDayDu = 0;
        for (int i = soNhoNhat; i <= soLonNhat; i++) {
            tongDayDayDu = tongDayDayDu + i;
        }

        int tongMangHienTai = 0;
        for (int i = 0; i < soPhanTu; i++) {
            tongMangHienTai = tongMangHienTai + mang[i];
        }

        return tongDayDayDu - tongMangHienTai;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int soPhanTu = scanner.nextInt();

        int[] mang = new int[soPhanTu];

        System.out.println("Nhập các phần tử:");
        for (int chiSo = 0; chiSo < soPhanTu; chiSo++) {
            mang[chiSo] = scanner.nextInt();
        }

        System.out.print("Nhập vị trí cần xóa: ");
        int viTriXoa = scanner.nextInt();

        xoaPhanTu(mang, soPhanTu, viTriXoa);








        System.out.print("Nhập số phần tử mảng tìm số còn thiếu: ");
        int soLuong = scanner.nextInt();

        int[] mangSo = new int[soLuong];

        System.out.println("Nhập các phần tử:");
        for (int chiSo = 0; chiSo < soLuong; chiSo++) {
            mangSo[chiSo] = scanner.nextInt();
        }

        int ketQua = timSoConThieu(mangSo, soLuong);
        System.out.println("Số còn thiếu là: " + ketQua);
    }
}