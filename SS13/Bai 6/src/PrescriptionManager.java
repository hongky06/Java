import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Medicine {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() { return drugId; }
    public String getDrugName() { return drugName; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    // Hiển thị thông tin dưới dạng một hàng trong bảng
    public void printRow() {
        System.out.printf("| %-10s | %-20s | %-12.0f | %-8d | %-15.0f |\n",
                drugId, drugName, unitPrice, quantity, getTotalPrice());
    }
}

// Lớp Quản lý Kê đơn thuốc
public class PrescriptionManager {
    private List<Medicine> prescription = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Hàm hỗ trợ tìm thuốc theo mã
    private Medicine findMedicineById(String id) {
        for (Medicine m : prescription) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    // 1. Thêm thuốc vào đơn (Có cộng dồn số lượng)
    private void addMedicine() {
        System.out.println("\n--- THÊM THUỐC ---");
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Medicine existingMedicine = findMedicineById(id);

        if (existingMedicine != null) {
            // Thuốc đã tồn tại -> Cộng dồn số lượng
            int newQuantity = existingMedicine.getQuantity() + quantity;
            existingMedicine.setQuantity(newQuantity);
            System.out.println("Thuốc đã tồn tại. Đã cập nhật số lượng thành: " + newQuantity);
        } else {
            // Thuốc mới -> Nhập thêm tên và giá
            System.out.print("Nhập tên thuốc: ");
            String name = scanner.nextLine();

            System.out.print("Nhập đơn giá (VNĐ): ");
            double price = Double.parseDouble(scanner.nextLine());

            prescription.add(new Medicine(id, name, price, quantity));
            System.out.println("Đã thêm thuốc mới vào đơn!");
        }
    }

    // 2. Điều chỉnh số lượng (Xóa nếu = 0)
    private void adjustQuantity() {
        System.out.println("\n--- ĐIỀU CHỈNH SỐ LƯỢNG ---");
        System.out.print("Nhập mã thuốc cần điều chỉnh: ");
        String id = scanner.nextLine();

        Medicine m = findMedicineById(id);
        if (m != null) {
            System.out.print("Nhập số lượng mới: ");
            int newQty = Integer.parseInt(scanner.nextLine());

            if (newQty <= 0) {
                prescription.remove(m);
                System.out.println("Số lượng = 0. Đã xóa thuốc khỏi đơn!");
            } else {
                m.setQuantity(newQty);
                System.out.println("Đã cập nhật số lượng thành công!");
            }
        } else {
            System.out.println("Không tìm thấy thuốc có mã: " + id);
        }
    }

    // 3. Xóa thuốc khỏi đơn
    private void removeMedicine() {
        System.out.println("\n--- XÓA THUỐC ---");
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = scanner.nextLine();

        Medicine m = findMedicineById(id);
        if (m != null) {
            prescription.remove(m);
            System.out.println("Đã xóa thuốc " + m.getDrugName() + " khỏi đơn.");
        } else {
            System.out.println("Không tìm thấy thuốc có mã: " + id);
        }
    }

    // 4. In hóa đơn và làm sạch danh sách
    private void printInvoice() {
        System.out.println("\n=========================== HÓA ĐƠN THUỐC ===========================");
        if (prescription.isEmpty()) {
            System.out.println("Đơn thuốc hiện đang trống!");
            System.out.println("=====================================================================");
            return;
        }

        // In tiêu đề bảng
        System.out.printf("| %-10s | %-20s | %-12s | %-8s | %-15s |\n",
                "Mã thuốc", "Tên thuốc", "Đơn giá", "Số lượng", "Thành tiền");
        System.out.println("---------------------------------------------------------------------");

        double totalAmount = 0;
        for (Medicine m : prescription) {
            m.printRow();
            totalAmount += m.getTotalPrice();
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("TỔNG TIỀN THANH TOÁN: %.0f VNĐ\n", totalAmount);
        System.out.println("=====================================================================");

        // Logic quan trọng: Xóa hết danh sách sau khi in hóa đơn
        prescription.clear();
        System.out.println("(Hệ thống đã tự động dọn dẹp danh sách để chuẩn bị cho đơn thuốc mới)");
    }

    // 5. Tìm thuốc giá rẻ (< 50.000 VNĐ)
    private void findCheapMedicines() {
        System.out.println("\n--- DANH SÁCH THUỐC GIÁ RẺ (< 50.000 VNĐ) ---");
        boolean found = false;

        for (Medicine m : prescription) {
            if (m.getUnitPrice() < 50000) {
                System.out.println("- " + m.getDrugName() + " (Mã: " + m.getDrugId() + ") - Giá: " + m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có loại thuốc nào dưới 50.000 VNĐ trong đơn hiện tại.");
        }
    }

    // Vòng lặp Menu chính
    public void start() {
        int choice = 0;
        do {
            System.out.println("\n========== PHẦN MỀM KÊ ĐƠN THUỐC ==========");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn (và làm mới đơn)");
            System.out.println("5. Tìm thuốc giá rẻ (< 50.000 VNĐ)");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng (1-6): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: addMedicine(); break;
                    case 2: adjustQuantity(); break;
                    case 3: removeMedicine(); break;
                    case 4: printInvoice(); break;
                    case 5: findCheapMedicines(); break;
                    case 6: System.out.println("Đã thoát chương trình kê đơn."); break;
                    default: System.out.println("Lựa chọn không hợp lệ!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        PrescriptionManager pm = new PrescriptionManager();
        pm.start();
    }
}