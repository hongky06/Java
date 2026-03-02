package Session15.baitap06;

import java.util.*;

class Patient {
    String id;
    String name;
    int age;
    String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " tuổi - " + gender;
    }
}

class PatientWaitingQueue {

    private Queue<Patient> waitingQueue = new LinkedList<>();

    public void addPatient(Patient p) {
        waitingQueue.offer(p); // thêm cuối queue
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    public Patient callNextPatient() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Không còn bệnh nhân chờ.");
            return null;
        }
        return waitingQueue.poll(); // lấy đầu queue
    }
}

class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return description + " | " + editedBy + " | " + editTime;
    }
}

class MedicalRecordHistory {

    private Stack<EditAction> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action); // thêm vào đỉnh stack
    }

    public EditAction undoEdit() {
        if (editStack.isEmpty()) {
            System.out.println("Không có chỉnh sửa để Undo!");
            return null;
        }
        return editStack.pop(); // xóa đỉnh
    }
}

class Ticket {
    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Số: " + ticketNumber + " | Thời gian: " + issuedTime;
    }
}

class TicketSystem {

    private Queue<Ticket> ticketQueue = new LinkedList<>();
    private int currentNumber = 0;

    public void issueTicket(String time) {
        currentNumber++;
        ticketQueue.offer(new Ticket(currentNumber, time));
        System.out.println("Phát số: " + currentNumber);
    }

    public Ticket callNext() {
        if (ticketQueue.isEmpty()) {
            System.out.println("Không còn số chờ.");
            return null;
        }
        return ticketQueue.poll();
    }
}

class InputAction {
    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    @Override
    public String toString() {
        return fieldName + " | " + oldValue + " -> " + newValue + " | " + actionTime;
    }
}

class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;
    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void recordAction(InputAction action) {

        // nếu vượt giới hạn thì xóa bước cũ nhất
        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0);
        }

        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Không còn thao tác để Undo.");
            return null;
        }
        return undoStack.pop();
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("===== HỆ THỐNG BỆNH VIỆN =====");

        // Queue bệnh nhân
        PatientWaitingQueue waitingQueue = new PatientWaitingQueue();
        waitingQueue.addPatient(new Patient("BN01", "An", 25, "Nam"));
        waitingQueue.addPatient(new Patient("BN02", "Bình", 30, "Nữ"));

        System.out.println("\nGọi bệnh nhân:");
        System.out.println(waitingQueue.callNextPatient());

        // Stack lịch sử chỉnh sửa
        MedicalRecordHistory history = new MedicalRecordHistory("HS01");
        history.addEdit(new EditAction("Thêm chẩn đoán", "BS Minh", "10:00"));
        history.addEdit(new EditAction("Cập nhật thuốc", "BS Minh", "10:10"));

        System.out.println("\nUndo chỉnh sửa:");
        System.out.println(history.undoEdit());

        // Hệ thống gọi số
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.issueTicket("09:00");
        ticketSystem.issueTicket("09:05");

        System.out.println("\nGọi số:");
        System.out.println(ticketSystem.callNext());

        // Undo nhập liệu
        UndoManager undoManager = new UndoManager(3);
        undoManager.recordAction(new InputAction("Họ tên", "An", "Nguyễn An", "11:00"));
        undoManager.recordAction(new InputAction("Tuổi", "25", "26", "11:05"));

        System.out.println("\nUndo nhập liệu:");
        System.out.println(undoManager.undo());
    }
}