import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- KIỂM TRA MÃ THẺ THƯ VIỆN ---");
        System.out.println("Định dạng chuẩn: TV202312345 (2 Chữ hoa + 4 số năm + 5 số ngẫu nhiên)");
        System.out.print("Nhập mã thẻ: ");
        String cardCode = scanner.nextLine().trim();

        String message = validateCard(cardCode);

        System.out.println("KẾT QUẢ: " + message);
    }

    public static String validateCard(String code) {
        if (code.length() != 11) {
            return "LỖI: Độ dài mã thẻ không đúng (Phải có 11 ký tự).";
        }
        if (!Pattern.matches("^[A-Z]{2}.*", code)) {
            return "LỖI: Thiếu tiền tố hoặc tiền tố không viết hoa (Ví dụ đúng: TV...).";
        }

        if (!Pattern.matches("^.{2}\\d{4}.*", code)) {
            return "LỖI: Năm nhập học không hợp lệ (Phải là 4 chữ số).";
        }
        if (!Pattern.matches(".*\\d{5}$", code)) {
            return "LỖI: Mã số ngẫu nhiên cuối cùng phải là 5 chữ số.";
        }
        return "Mã thẻ hợp lệ";
    }
}