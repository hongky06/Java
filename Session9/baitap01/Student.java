package Session9.baitap01;

public class Student extends Person {
    private String maSV;
    private double diemTB;

    public Student(String hoTen, int tuoi, String maSV, double diemTB) {
        super(hoTen, tuoi); // Gọi constructor lớp cha
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Dùng lại code của Person
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm TB: " + diemTB);
    }
}
