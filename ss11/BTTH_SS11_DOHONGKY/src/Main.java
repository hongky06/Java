public class Main {
    public static void main(String[] args) {

        DoUong[] danhSachDoUong = new DoUong[3];

        danhSachDoUong[0] = new CaPhe(1, "Bạc sỉu", 30000, true);
        danhSachDoUong[1] = new NuocTraiCay(2, "Nước cam", 40000, 10);
        danhSachDoUong[2] = null;

        for (int i = 0; i < danhSachDoUong.length; i++) {

            if (danhSachDoUong[i] != null) {
                System.out.println("HÓA ĐƠN ");

                danhSachDoUong[i].hienThiThongTin();

                System.out.println("Thành tiền: " + danhSachDoUong[i].tinhGia());

                if (danhSachDoUong[i] instanceof NuocTraiCay) {
                    NuocTraiCay nuoc = (NuocTraiCay) danhSachDoUong[i];
                    nuoc.mix();
                }

                System.out.println();
            }
        }
    }
}