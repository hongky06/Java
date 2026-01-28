import java.util.stream.Collector;

public class Main {
    public static void chinhsua (String monhoc , String Nguoiday){
        monhoc = monhoc.trim();
        monhoc = monhoc.replaceAll("\\s+", " ");

//        ------------------------------------------------

        Nguoiday=Nguoiday.trim();
        Nguoiday =  Nguoiday.replaceAll("\\s+" , " ");
        String[] chuoimoi = Nguoiday.split(" ");
        String ketQuaNguoiDay = "";
        for(int i=0;i<chuoimoi.length;i++){
            String tuhientai =  chuoimoi[i];
            String tuDaChinhSua =
                    Character.toUpperCase(tuhientai.charAt(0)) +
                            tuhientai.substring(1).toLowerCase();

            ketQuaNguoiDay =  ketQuaNguoiDay + tuDaChinhSua + " ";
        }

        System.out.println(monhoc);
        System.out.println(ketQuaNguoiDay);
    }

    public static void main(String[] args) {
        String monhoc = "  Lập trình               java cơ                               bản      ";
        String nguoi_day ="do hong ky ";
        chinhsua(monhoc, nguoi_day);
    }
}