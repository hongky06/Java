class Employee{
    private String maNV;
    private String tenNV;
    private double luong;
    public Employee() {
        this.maNV = "Chưa có";
        this.tenNV = "Chưa có";
        this.luong = 0;
    }
    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = 0;
    }
    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.printf("Lương: %.2f\n", luong);
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("NV001", "Nguyễn Văn A");
        Employee e3 = new Employee("NV002", "Trần Thị B", 15000000);
        e1.hienThiThongTin();
        e2.hienThiThongTin();
        e3.hienThiThongTin();
    }
}