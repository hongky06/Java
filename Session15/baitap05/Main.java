package Session15.baitap05;

import java.util.*;

class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "ID: " + id + " | Tên: " + name;
    }
}

class TreatmentStep {
    private String description;
    private String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() { return description; }
    public String getTime() { return time; }

    @Override
    public String toString() {
        return description + " - " + time;
    }
}

class EmergencyCase {
    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();
    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    // Thêm bước xử lý (push)
    public void addStep(TreatmentStep step) {
        steps.push(step); // LIFO
        System.out.println("Đã thêm bước: " + step);
    }

    // Undo bước gần nhất (pop)
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để Undo!");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Đã Undo: " + removed);
        return removed;
    }

    // Hiển thị các bước (không pop để tránh mất dữ liệu)
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý.");
            return;
        }

        System.out.println("Các bước xử lý (Mới → Cũ):");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }

    public Patient getPatient() {
        return patient;
    }
}

class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases = new LinkedList<>();

    // Thêm ca mới (FIFO)
    public void addCase(EmergencyCase c) {
        cases.offer(c); // thêm vào cuối queue
        System.out.println("Đã tiếp nhận: " + c.getPatient());
    }

    // Lấy ca tiếp theo để xử lý
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ.");
            return null;
        }
        EmergencyCase next = cases.poll(); // lấy và xóa đầu queue
        System.out.println("Đang xử lý: " + next.getPatient());
        return next;
    }
}

public class Main {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        // Tạo bệnh nhân
        EmergencyCase case1 = new EmergencyCase(new Patient("BN01", "An"));
        EmergencyCase case2 = new EmergencyCase(new Patient("BN02", "Bình"));

        // Thêm vào Queue
        queue.addCase(case1);
        queue.addCase(case2);

        System.out.println("\n--- Bắt đầu xử lý ---");

        EmergencyCase current = queue.getNextCase();

        // Thêm các bước xử lý (Stack)
        current.addStep(new TreatmentStep("Tiếp nhận", "10:00"));
        current.addStep(new TreatmentStep("Chẩn đoán", "10:05"));
        current.addStep(new TreatmentStep("Điều trị", "10:15"));

        current.displaySteps();

        System.out.println("\n--- Undo bước gần nhất ---");
        current.undoStep();

        current.displaySteps();
    }
}