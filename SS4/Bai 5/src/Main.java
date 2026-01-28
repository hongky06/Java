
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main  {
    public static void main(String[] args) {
        List<String> logList = new ArrayList<>();
        logList.add("2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345");
        logList.add("2024-05-21 | User: TranThiB | Action: RETURN | BookID: BK009");
        logList.add("2024-05-22 | User: LeVanC | Action: BORROW | BookID: BK888");
        String regex = "^(\\d{4}-\\d{2}-\\d{2})\\s\\|\\sUser:\\s(\\w+)\\s\\|\\sAction:\\s(\\w+)\\s\\|\\sBookID:\\s(\\w+)$";
        Pattern pattern = Pattern.compile(regex);

        int countBorrow = 0;
        int countReturn = 0;

        System.out.println("--- KẾT QUẢ PHÂN TÍCH ---");

        for (String logLine : logList) {
            Matcher matcher = pattern.matcher(logLine.trim());
            if (matcher.find()) {
                String date     = matcher.group(1);
                String user     = matcher.group(2);
                String action   = matcher.group(3);
                String bookId   = matcher.group(4);

                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookId);
                System.out.println("-------------------------");
                if (action.equals("BORROW")) {
                    countBorrow++;
                } else if (action.equals("RETURN")) {
                    countReturn++;
                }
            }else {
                System.out.println("lỗi");
            }
        }
    }
}