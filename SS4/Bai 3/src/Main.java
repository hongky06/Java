import java.text.SimpleDateFormat;
import java.util.Date;

public class Main  {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(new Date());

        long startSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (String k : transactions) {
            sb = new StringBuilder(); // Reset để tạo lại từ đầu
            sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
            sb.append("Ngày tạo: ").append(currentDate).append("\n");
            for (String trans : transactions) {
                sb.append("Giao dịch: ").append(trans).append("\n");
            }
        }

        long endSB = System.currentTimeMillis();
        long timeSB = endSB - startSB;

        long startStr = System.currentTimeMillis();

        String reportStr = "";

        reportStr = "";
        reportStr += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        reportStr += "Ngày tạo: " + currentDate + "\n";
        for (String trans : transactions) {
            reportStr += "Giao dịch: " + trans + "\n";
        }


        long endStr = System.currentTimeMillis();
        long timeStr = endStr - startStr;

        System.out.println(sb.toString());
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSB);
        System.out.println(reportStr);
        System.out.println("Số thời gian thực thi đối với String: " + timeStr);
    }
}