import java.util.Scanner;

public class Main {

    static void timGiaoHaiMang(
            int[] mangA, int soPhanTuA,
            int[] mangB, int soPhanTuB) {

        for (int chiSoA = 0; chiSoA < soPhanTuA; chiSoA++) {

            boolean daXuatHienTruocDo = false;

            for (int chiSoTruoc = 0; chiSoTruoc < chiSoA; chiSoTruoc++) {
                if (mangA[chiSoA] == mangA[chiSoTruoc]) {
                    daXuatHienTruocDo = true;
                }
            }

            if (daXuatHienTruocDo == false) {

                boolean coTrongMangB = false;

                for (int chiSoB = 0; chiSoB < soPhanTuB; chiSoB++) {
                    if (mangA[chiSoA] == mangB[chiSoB]) {
                        coTrongMangB = true;
                    }
                }

                if (coTrongMangB == true) {
                    System.out.print(mangA[chiSoA] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng A: ");
        int soPhanTuA = scanner.nextInt();

        int[] mangA = new int[soPhanTuA];

        System.out.println("Nhập mảng A:");
        for (int chiSo = 0; chiSo < soPhanTuA; chiSo++) {
            mangA[chiSo] = scanner.nextInt();
        }





        System.out.print("Nhập số phần tử mảng B: ");
        int soPhanTuB = scanner.nextInt();

        int[] mangB = new int[soPhanTuB];

        System.out.println("Nhập mảng B:");
        for (int chiSo = 0; chiSo < soPhanTuB; chiSo++) {
            mangB[chiSo] = scanner.nextInt();
        }

        System.out.print("Giao của hai mảng là: ");
        timGiaoHaiMang(mangA, soPhanTuA, mangB, soPhanTuB);
    }
}