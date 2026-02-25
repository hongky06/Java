public class Main {

    static void giaoHaiMang(int[] A, int[] B) {
        boolean daIn;

        for (int i = 0; i < A.length; i++) {
            daIn = false;
            for (int k = 0; k < i; k++) {
                if (A[i] == A[k]) {
                    daIn = true;
                }
            }

            if (daIn) continue;

            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 5};
        int[] B = {2, 2, 5, 6};

        giaoHaiMang(A, B);
    }
}