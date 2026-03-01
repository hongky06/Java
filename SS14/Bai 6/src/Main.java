import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Patient> danhSach = new ArrayList<>();
        danhSach.add(new Patient("Lan", 30, "Tim mạch"));
        danhSach.add(new Patient("Hùng", 45, "Nội tiết"));
        danhSach.add(new Patient("Mai", 28, "Tim mạch"));


        Map<String, List<Patient>> mapKhoa = new HashMap<>();

        // Gom nhóm
        for (Patient p : danhSach) {
            if (!mapKhoa.containsKey(p.khoa)) {
                mapKhoa.put(p.khoa, new ArrayList<>());
            }
            mapKhoa.get(p.khoa).add(p);
        }


        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : mapKhoa.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }

        String khoaCanXem = "Tim mạch";
        System.out.println("\nBệnh nhân khoa " + khoaCanXem + ":");
        if (mapKhoa.containsKey(khoaCanXem)) {
            for (Patient p : mapKhoa.get(khoaCanXem)) {
                System.out.println("- " + p);
            }
        } else {
            System.out.println("Không có khoa này");
        }

        String khoaDongNhat = "";
        int max = 0;

        for (Map.Entry<String, List<Patient>> entry : mapKhoa.entrySet()) {
            if (entry.getValue().size() > max) {
                max = entry.getValue().size();
                khoaDongNhat = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + khoaDongNhat + " đang đông nhất (" + max + " bệnh nhân)");
    }
}