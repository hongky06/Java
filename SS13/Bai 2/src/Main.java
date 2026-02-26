import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<String> xuLyDanhSachThuoc(List<String> input) {
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String drug : input) {
            if (!uniqueList.contains(drug)) {
                uniqueList.add(drug);
            }
        }
        Collections.sort(uniqueList);
        return uniqueList;
    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );
        System.out.println("Danh sách ban đầu: "+input);
        List<String> result = xuLyDanhSachThuoc(input);
        System.out.print("Danh sách sau xử lý:");
        System.out.println(result);
    }
}