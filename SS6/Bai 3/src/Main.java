import java.util.Scanner;
public class Main {
    static class Product  {
        String ma_sp;
        String nameSP;
        double priceSP;



        public Product ( String ma_sp, String nameSP, double priceSP){
         if (priceSP > 0 ) {
             this.ma_sp = ma_sp;
             this.nameSP = nameSP;
             this.priceSP = priceSP ;
         }else {
             System.out.printf("Thử set giá không hợp lệ");
         }
        }


        public void hienthi (){
            System.out.println("Nam sinh: " + ma_sp);
            System.out.println("Password sinh: " + nameSP);
            System.out.println("Price sinh: " + priceSP);
        }
    }


    public static void main(String[] args) {
        Product newProduct = new Product("dohongky" , "abc" , 8.5);
        newProduct.hienthi();
    }
}