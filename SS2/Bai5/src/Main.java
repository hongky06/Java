import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diemUyTin = 100;
        int ngayTre;

        System.out.println("Nhập lịch sử trả sách (nhập 999 để kết thúc):");

        while (true) {
            System.out.print("Nhập số ngày trễ: ");
            ngayTre = sc.nextInt();


            if (ngayTre == 999) {
                break;
            }
            if (ngayTre <= 0) {
                diemUyTin += 5;
            } else {
                diemUyTin -= ngayTre * 2;
            }
        }


        System.out.println("\nTổng điểm uy tín: " + diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Xếp loại: Độc giả Thân thiết");
        } else if (diemUyTin >= 80) {
            System.out.println("Xếp loại: Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Xếp loại: Độc giả cần lưu ý");
        }

        sc.close();
    }
}