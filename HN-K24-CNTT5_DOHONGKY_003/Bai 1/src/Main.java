import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so don hang: ");
        int n = sc.nextInt();
        List<Double> phi = new ArrayList<>();
        System.out.println("Nhap phi van chuyen:");
        for (int i = 0; i < n; i++) {
            phi.add(sc.nextDouble());
        }

        double min = phi.get(0);
        double max = phi.get(0);
        double sum = 0;
        int express = 0;

        for (double p : phi) {
            if (p < min) {
                min = p;
            }

            if (p > max) {
                max = p;
            }





















            int som = 0;
            if (p >= 50.0) {
                som++;
            }
        }

        double Average = sum / n;

        Set<Double> unique = new HashSet<>(phi);

        List<Double> uniqueList = new ArrayList<>(unique);

        for (int i = 0; i < uniqueList.size() - 1; i++) {
            for (int j = 0; j < uniqueList.size() - i - 1; j++) {

                if (uniqueList.get(j) < uniqueList.get(j + 1)) {

                    double temp = uniqueList.get(j);
                    uniqueList.set(j, uniqueList.get(j + 1));
                    uniqueList.set(j + 1, temp);

                }
            }
        }

        System.out.println("so thap nhat : " + min + ", so cao nhat : " + max);
        System.out.println("trung binh: " + Average);

        System.out.print("sap xep: ");
        for (double a : uniqueList) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("Express: " + express);
    }
}