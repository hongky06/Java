public class Main {

    // Lớp Student
    static class Student {
        // Thuộc tính
        String studentId;
        String fullName;
        int birthYear;
        double avgScore;

        // Constructor có tham số
        public Student(String studentId, String fullName, int birthYear, double avgScore) {
            this.studentId = studentId;
            // this có tác dụng tham chiều tới  chính đối tượng hiện tại đang gọi
            this.fullName = fullName;
            this.birthYear = birthYear;
            this.avgScore = avgScore;
        }

        // Phương thức hiển thị thông tin sinh viên
        public void displayInfo() {
            System.out.println("Ma sinh vien: " + studentId);
            System.out.println("Ho ten: " + fullName);
            System.out.println("Nam sinh: " + birthYear);
            System.out.println("Diem trung binh: " + avgScore);
            System.out.println("-------------------------");
        }
    }

    // Hàm main
    public static void main(String[] args) {

        Student sv1 = new Student("B2101234", "Nguyen Van A", 2003, 8.5);
        Student sv2 = new Student("B2101235", "Tran Thi B", 2004, 7.8);


        sv1.displayInfo();
        sv2.displayInfo();
    }
}
