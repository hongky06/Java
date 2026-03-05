//kiểm tra điều kiện ngoặc :  biến check mở ngoặc , thì mới được đóng ngoặc
//
//
//        kiểm tra thứ tự đóng mở của ngoặc :
//
//
//
//        {        a + (       b * c          ) - (     d /             [         e + f          ]        )         }
//
//
//
//
//        index       0            3                     7    9                    12                        16       17        18
//
//
//
//
//        th1 : so sánh ngoặc ngoài cùng : so sánh index của ngoặc đầu tiền với  index của ngoặc cuối cùng để so sánh 2 ngoặc cuối có phải 1 cặp k
//
//
//
//        th2 cặp ngoặc tiếp theo : khi tới ngoặc tròn , kiểm tra vị trí ngoặc đóng tiếp theo là đóng hay mở , nếu là đóng thì có phải của ngoặc trước đó k , nếu là mở thì ngoặc tiếp theo có phải là của cái trước nó
//
//        kiểm tra nếu sau dấu +_*/ thì không có ngoặc



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Lỗi: Biểu thức không hợp lệ");
            return;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    System.out.println("false");
                    return;
                }

                if (ch == ']' && top != '[') {
                    System.out.println("false");
                    return;
                }

                if (ch == '}' && top != '{') {
                    System.out.println("false");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}