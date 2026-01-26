import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int soNgayMoCua = 0;


        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhập lượt mượn sách ngày " + i + ": ");
            int luotMuon = sc.nextInt();



            if (luotMuon == 0) {
                continue;
            }


            tong += luotMuon;
            soNgayMoCua++;



            if (luotMuon > max) {
                max = luotMuon;
            }


            if (luotMuon < min) {
                min = luotMuon;
            }
        }


        if (soNgayMoCua > 0) {
            double trungBinh = (double) tong / soNgayMoCua;


            System.out.println("\nLượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.println("Lượt mượn trung bình: " + trungBinh);
        } else {
            System.out.println("Tuần này thư viện không mở cửa ngày nào.");
        }


        sc.close();
    }
}