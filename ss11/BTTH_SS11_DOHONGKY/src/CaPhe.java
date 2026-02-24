public class CaPhe extends DoUong {

    private boolean coSua;

    public CaPhe(int id, String ten, double giaGoc, boolean coSua) {
        super(id, ten, giaGoc);
        this.coSua = coSua;
    }

    @Override
    public double tinhGia() {
        if (coSua) {
            return giaGoc + 5000;
        }
        return giaGoc;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        if (coSua) {
            System.out.println("Loại: Có sữa");
        } else {
            System.out.println("Loại: Đen đá");
        }
    }
}