import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double giaUSD = sc.nextDouble();


        System.out.print("Nhập tỷ giá USD -> VND (float): ");
        float tyGia = sc.nextFloat();


        double giaChinhXac = giaUSD * tyGia;


        long giaLamTron = (long) giaChinhXac;


        System.out.println("Giá chính xác (số thực): " + giaChinhXac);
        System.out.println("Giá làm tròn để thanh toán (long): " + giaLamTron);
    }
}