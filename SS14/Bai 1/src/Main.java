import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> danhSachBenhNhan = new LinkedHashSet<>();

        // Nhân viên nhập tên bệnh nhân
        danhSachBenhNhan.add("Nguyễn Văn A");
        danhSachBenhNhan.add("Trần Thị B");
        danhSachBenhNhan.add("Nguyễn Văn A");
        danhSachBenhNhan.add("Lê Văn C");
        danhSachBenhNhan.add("Trần Thị B");

        System.out.println("Danh sách bệnh nhân chờ khám:");
        for (String ten : danhSachBenhNhan) {
            System.out.println(ten);
        }
    }
}