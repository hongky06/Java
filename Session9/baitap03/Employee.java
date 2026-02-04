package Session9.baitap03;

public class Employee {
    protected String ten;
    protected double luongCoBan;

    public Employee(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.printf("Lương cơ bản: %.2f\n",luongCoBan);
    }
}
