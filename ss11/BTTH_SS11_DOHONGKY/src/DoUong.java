public abstract class DoUong {
    protected int id;
    protected String ten;
    protected double giaGoc;

    public DoUong(int id, String ten, double giaGoc) {
        this.id = id;
        this.ten = ten;
        this.giaGoc = giaGoc;
    }

    public abstract double tinhGia();

    public void hienThiThongTin() {
        System.out.println("Mã đồ uống: " + id);
        System.out.println("Tên đồ uống: " + ten);
        System.out.println("Giá gốc: " + giaGoc);
    }
}