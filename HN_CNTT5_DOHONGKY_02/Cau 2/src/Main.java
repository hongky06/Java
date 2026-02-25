import java.util.Scanner;

public class Main {

    // PHẦN 1: Xóa phần tử theo vị trí
    static void xoaPhanTu(int[] a, int n, int index) {
        for (int i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // PHẦN 2: Tìm số còn thiếu
    static int timSoThieu(int[] a) {
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        int tongDay = 0;
        for (int i = min; i <= max; i++) {
            tongDay += i;
        }

        int tongMang = 0;
        for (int i = 0; i < a.length; i++) {
            tongMang += a[i];
        }

        return tongDay - tongMang;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};
        System.out.print("Nhập index cần xóa: ");
        int index = sc.nextInt();

        xoaPhanTu(a, a.length, index);

        int[] b = {3, 0, 1};
        System.out.println("Số còn thiếu: " + timSoThieu(b));
    }
}