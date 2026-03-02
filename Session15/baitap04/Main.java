package Session15.baitap04;

import java.util.PriorityQueue;
import java.util.Comparator;

class EmergencyPatient {
    private String id;
    private String name;
    private int priority; // 1: cấp cứu, 2: thường
    private long arrivalOrder;
    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public int getPriority() { return priority; }
    public long getArrivalOrder() { return arrivalOrder; }
    public void setArrivalOrder(long arrivalOrder) {
        this.arrivalOrder = arrivalOrder;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                " | Tên: " + name +
                " | Mức độ: " + (priority == 1 ? "CẤP CỨU" : "THƯỜNG");
    }
}

class EmergencyQueue {
    private long counter = 0;
    private PriorityQueue<EmergencyPatient> queue =
            new PriorityQueue<>(new Comparator<EmergencyPatient>() {
                @Override
                public int compare(EmergencyPatient p1, EmergencyPatient p2) {
                    if (p1.getPriority() != p2.getPriority()) {
                        return p1.getPriority() - p2.getPriority();
                    }
                    return Long.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
                }
            });

    public void addPatient(EmergencyPatient p) {
        p.setArrivalOrder(counter++);
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p);
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân trong hàng đợi!");
            return null;
        }
        EmergencyPatient next = queue.poll();
        System.out.println("Gọi khám: " + next);
        return next;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi đang trống.");
            return;
        }

        System.out.println("=== DANH SÁCH CHỜ ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("BN01", "An", 2));
        eq.addPatient(new EmergencyPatient("BN02", "Bình", 1));
        eq.addPatient(new EmergencyPatient("BN03", "Cường", 2));
        eq.addPatient(new EmergencyPatient("BN04", "Dũng", 1));

        System.out.println("\n--- GỌI KHÁM ---");
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
        eq.callNextPatient();
    }
}