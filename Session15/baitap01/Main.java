package Session15.baitap01;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addHistory(new EditAction("Thêm chuẩn đoán viêm họng", "10:00"));
        history.addHistory(new EditAction("Cập nhật toa thuốc", "10:15"));
        history.addHistory(new EditAction("Bổ sung kết quả xét nghiệm", "10:30"));
        history.displayHistory();
        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLastHistory().getDescription());
        System.out.println("\nThực hiện Undo...");
        history.undoEdit();
        System.out.println("\nSau khi Undo:");
        history.displayHistory();
    }
}
