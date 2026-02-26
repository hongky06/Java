import java.util.LinkedList;

public class Main {
    private LinkedList<String> queue;
    public void EmergencyRoom() {
        this.queue = new LinkedList<>();
    }
    // Bệnh nhân thường: Thêm vào cuối hàng đợi (addLast)
    public void patientCheckIn(String name) {
        queue.addLast("NORMAL:" + name);
    }
    // Ca cấp cứu: Chèn ngay vào đầu hàng đợi (addFirst)
    public void emergencyCheckIn(String name) {
        // Gắn tiền tố "EMERG:" để nhận diện ca khẩn cấp
        queue.addFirst("EMERG:" + name);
    }
    // Bác sĩ gọi bệnh nhân đầu tiên vào phòng khám (removeFirst)
    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân nào đang chờ.");
            return;
        }
        // Lấy và xóa bệnh nhân ở đầu hàng đợi
        String patientData = queue.removeFirst();
        // Kiểm tra tiền tố để in ra thông báo tương ứng
        if (patientData.startsWith("EMERG:")) {
            // Cắt bỏ 6 ký tự đầu ("EMERG:") để lấy tên thật
            System.out.println("Đang cấp cứu: " + patientData.substring(6));
        } else if (patientData.startsWith("NORMAL:")) {
            // Cắt bỏ 7 ký tự đầu ("NORMAL:") để lấy tên thật
            System.out.println("Đang khám: " + patientData.substring(7));
        }
    }
    public static <EmergencyRoom> void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();

        // Mô phỏng luồng bệnh nhân đến
        er.patientCheckIn("A");       // Bệnh nhân A đến
        er.patientCheckIn("B");       // Bệnh nhân B đến
        er.emergencyCheckIn("C");     // Ca C nguy kịch đến đột xuất

        // Bác sĩ lần lượt chữa trị
        er.treatPatient(); // Lấy C ra trước vì ở đầu hàng
        er.treatPatient(); // Đến lượt A
        er.treatPatient(); // Cuối cùng là B
    }
}