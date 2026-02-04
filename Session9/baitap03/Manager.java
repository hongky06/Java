package Session9.baitap03;

public class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan); // PHẢI là dòng đầu tiên
        this.phongBan = phongBan;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Dùng lại code của Employee
        System.out.println("Phòng ban: " + phongBan);
    }
}
