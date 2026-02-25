import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);




        System.out.printf("Mời bạn nhập số lượng phần tử của mảng ");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i <= length; i++) {
            System.out.printf("mời bạn nhập phần tử thứ  " + i +   "=" );
             arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i <= length; i++) {
            System.out.printf(String.valueOf(arr[i]));

        }
    }
}