public class Student {
    // ===== Biến instance (mỗi sinh viên có riêng) =====
    private String studentId;
    private String studentName;

    // ===== Biến static (dùng chung cho tất cả sinh viên) =====
    private static int totalStudent = 0;

    // ===== Constructor =====
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++; // mỗi lần tạo sinh viên → tăng tổng
    }

    // ===== Phương thức instance =====
    public void displayInfo() {
        System.out.println("Mã SV: " + studentId + " | Tên SV: " + studentName);
    }

    // ===== Phương thức static =====
    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

    // ===== Hàm main để chạy chương trình =====
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "An");
        Student s2 = new Student("SV02", "Bình");
        Student s3 = new Student("SV03", "Chi");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.displayTotalStudent();
    }
}
