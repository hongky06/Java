import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách 4 chữ số: ");
        int number = sc.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println(false);
            return;
        }

        int thousands = number / 1000;
        int hundreds  = (number / 100) % 10;
        int dozens    = (number / 10) % 10;
        int units     = number % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;


        boolean isValid = (sumOfFirstThreeNumber % 10 == units);

        System.out.println(isValid);
    }
}