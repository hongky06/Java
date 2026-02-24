public class NuocTraiCay extends DoUong implements IMixable {

    private int phanTramGiamGia;

    public NuocTraiCay(int id, String ten, double giaGoc, int phanTramGiamGia) {
        super(id, ten, giaGoc);
        this.phanTramGiamGia = phanTramGiamGia;
    }

    @Override
    public double tinhGia() {
        return giaGoc - (giaGoc * phanTramGiamGia / 100);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }
}