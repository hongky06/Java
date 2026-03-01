import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Patient> danhSach = new ArrayList<>();


        danhSach.add(new Patient("Bệnh nhân A", 3, 480));
        danhSach.add(new Patient("Bệnh nhân B", 1, 495));
        danhSach.add(new Patient("Bệnh nhân C", 1, 485));

        Collections.sort(danhSach, new PatientComparator());


        System.out.println("Thứ tự xử lý:");
        for (Patient p : danhSach) {
            System.out.println(p);
        }
    }
}