package Session9.baitap05;

public class OfficeEmployee extends Employee {
    private double luongCoBan;
    public OfficeEmployee(String ten, double luongCoBan) {
        super(ten);
        this.luongCoBan = luongCoBan;
    }
    @Override
    public double calculateSalary() {
        return luongCoBan; // Lương cố định
    }
}
