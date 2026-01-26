import java.util.Scanner;

class check  {
    String input;

    void nhap(Scanner sc) {
        do {
            System.out.print("Nhap kí tự (A B C D ): ");
            input = sc.nextLine();

            if (input.length() != 1) {
                System.out.print("bạn đã nhập khác 1 kí tự , voi lòng nhập lại \n ");
                continue;
            } else {
                switch (input) {
                    case "A":
                        System.out.println("Tầng 1: Sách Văn học ");
                        break;
                    case "B":
                        System.out.println("Tầng 2: Sách Khoa học");
                        break;

                    case "C":
                        System.out.println("Tầng 3: Sách Ngoại ngữ ");
                        break;

                    case "D":
                        System.out.println("Tầng 4: Sách Tin học");
                        break;
                    default:
                        System.out.println("Chi duoc nhap A, B, C hoac D");
                        input = "";
                }
            }
        } while (input.length() != 1);
        }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check check = new check();
        check.nhap(sc);
    }
}