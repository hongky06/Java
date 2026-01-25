import java.util.Scanner;

class nhanSach {
    int ngaychamtre;
    int soluongsachmuon;
    float tienphatgoc ;
    float sotienphatdieuchinh;
    boolean yeucaukhoathe;



    void nhapThongTin(Scanner sc) {
        System.out.print("Nhập ngày chậm trễ: ");
        ngaychamtre = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng sách mượn: ");
        soluongsachmuon = Integer.parseInt(sc.nextLine());

        tienphatgoc = ngaychamtre * soluongsachmuon * 5000;

        if (ngaychamtre > 7f && soluongsachmuon >= 3f) {
            sotienphatdieuchinh = tienphatgoc * 0.2f;
        } else {
            sotienphatdieuchinh = tienphatgoc;
        }

        if (tienphatgoc >= 50.000f) {
            yeucaukhoathe = true;
        }else {
            yeucaukhoathe = false;
        }
    }


    void hienThiThongTin() {
        System.out.println("\n----- THÔNG TIN NHẬN SÁCH -----");
        System.out.println("Ngày chậm trễ: " + ngaychamtre);
        System.out.println("Số lượng sách mượn: " + soluongsachmuon);
        System.out.println("Tiền phạt gốc: " + tienphatgoc + " VNĐ");
        System.out.println("Tiền phạt phải trả: " + sotienphatdieuchinh + " VNĐ");
        System.out.println("Yêu cầu khóa thẻ: " + (yeucaukhoathe ? "CÓ" : "KHÔNG"));
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanSach nhanSach = new nhanSach();
        nhanSach.nhapThongTin(sc);
        nhanSach.hienThiThongTin();
    }
}