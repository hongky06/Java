package Session9.baitap05;

public class ProductionEmployee extends Employee {
    private int soSanPham;
    private double tienMoiSanPham;

    public ProductionEmployee(String ten, int soSanPham, double tienMoiSanPham) {
        super(ten);
        this.soSanPham = soSanPham;
        this.tienMoiSanPham = tienMoiSanPham;
    }
    @Override
    public double calculateSalary() {
        return soSanPham * tienMoiSanPham; // Lương theo sản phẩm
    }
}
