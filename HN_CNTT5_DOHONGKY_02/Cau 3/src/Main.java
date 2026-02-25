import  java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] chung ;


            System.out.printf("Mời bạn nhập số lượng phần tử của mảng A ");
            int m = Integer.parseInt(sc.nextLine());
            int[] A = new int[m];


            System.out.printf("Mời bạn nhập số lượng phần tử của mảng B ");
            int n = Integer.parseInt(sc.nextLine());
            int[] B = new int[n];

            System.out.println(m);
            System.out.println(n);

            for (int i = 0; i <= m; i++) {
                System.out.printf("A[" + i +   "] = " );
                int element = Integer.parseInt(sc.nextLine());
                A[i] = element;
            }

            for (int i = 0; i <= n; i++) {
                int[] y = new int[n];
                System.out.printf("B[" + i +   "] = " );
                int element = Integer.parseInt(sc.nextLine());
                y[i] = element;
            }












        }
}