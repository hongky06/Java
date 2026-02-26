import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lớp đại diện cho Bệnh nhân
class Patient {
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getDiagnosis() { return diagnosis; }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5s | Tên: %-20s | Tuổi: %-3d | Chẩn đoán: %s",
                id, fullName, age, diagnosis);
    }
}

// Lớp quản lý và chạy chương trình Menu
public class HospitalManager {
    private List<Patient> patients = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 1. Tiếp nhận bệnh nhân
    private void addPatient() {
        System.out.println("\n--- THÊM BỆNH NHÂN ---");
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        // Kiểm tra ID trùng lặp
        if (findPatientById(id) != null) {
            System.out.println("Lỗi: ID này đã tồn tại trong hệ thống!");
            return;
        }

        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine()); // Tránh lỗi trôi lệnh khi dùng nextInt()

        System.out.print("Nhập chẩn đoán bệnh: ");
        String diagnosis = scanner.nextLine();

        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Đã tiếp nhận bệnh nhân thành công!");
    }

    // 2. Cập nhật chẩn đoán
    private void updateDiagnosis() {
        System.out.println("\n--- CẬP NHẬT CHẨN ĐOÁN ---");
        System.out.print("Nhập ID bệnh nhân cần cập nhật: ");
        String id = scanner.nextLine();

        Patient p = findPatientById(id);
        if (p != null) {
            System.out.print("Nhập chẩn đoán mới: ");
            String newDiagnosis = scanner.nextLine();
            p.setDiagnosis(newDiagnosis);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không tìm thấy bệnh nhân với ID: " + id);
        }
    }

    // 3. Xuất viện
    private void dischargePatient() {
        System.out.println("\n--- XUẤT VIỆN ---");
        System.out.print("Nhập ID bệnh nhân xuất viện: ");
        String id = scanner.nextLine();

        Patient p = findPatientById(id);
        if (p != null) {
            patients.remove(p);
            System.out.println("Bệnh nhân " + p.getFullName() + " đã xuất viện và được xóa khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy bệnh nhân với ID: " + id);
        }
    }

    // 4. Sắp xếp danh sách
    private void sortAndDisplayPatients() {
        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ---");
        if (patients.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        // Sắp xếp dùng Lambda Expression
        patients.sort((p1, p2) -> {
            if (p1.getAge() != p2.getAge()) {
                // Tuổi giảm dần (Người già ưu tiên trước)
                return Integer.compare(p2.getAge(), p1.getAge());
            } else {
                // Nếu tuổi bằng nhau, sắp xếp theo tên (A-Z)
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        for (Patient p : patients) {
            System.out.println(p.toString());
        }
    }

    // Hàm hỗ trợ tìm kiếm bệnh nhân theo ID
    private Patient findPatientById(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Vòng lặp Menu chính
    public void start() {
        int choice = 0;
        do {
            System.out.println("\n========== QUẢN LÝ BỆNH VIỆN ==========");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp và in danh sách bệnh nhân");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: addPatient(); break;
                    case 2: updateDiagnosis(); break;
                    case 3: dischargePatient(); break;
                    case 4: sortAndDisplayPatients(); break;
                    case 5: System.out.println("Đã thoát chương trình."); break;
                    default: System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        HospitalManager manager = new HospitalManager();
        manager.start();
    }
}