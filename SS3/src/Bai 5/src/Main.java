import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] xoa(int[] mang, int so) {
        int vitri = -1;

        // 1. Tìm vị trí cần xóa
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == so) {
                vitri = i;
                break;
            }
        }

        if (vitri == -1) {
            return mang;
        }

        int[] newArr = new int[mang.length - 1];

        for (int i = 0, j = 0; i < mang.length; i++) {
            if (i != vitri) {
                newArr[j++] = mang[i];
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 9, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("nhập so muon xoa : ");
        int so_muon_xoa = Integer.parseInt(input.nextLine());
        arr = xoa(arr, so_muon_xoa);
        System.out.println(Arrays.toString(arr));
    }
}