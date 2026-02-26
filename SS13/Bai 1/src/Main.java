import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Double> nhietDo = new ArrayList<>();
        double avg = 0;
        nhietDo.add(36.5);
        nhietDo.add(40.2);
        nhietDo.add(37.0);
        nhietDo.add(12.5);
        nhietDo.add(39.8);
        nhietDo.add(99.9);
        nhietDo.add(36.8);
        Iterator<Double> is = nhietDo.iterator();
        System.out.print("Danh sách ban đầu: ");
        System.out.println(nhietDo);
        System.out.print("Danh sách sau khi lọc: ");
        while (is.hasNext()){
            Double i = is.next();
            if (i < 34.0 || i>42.0 ){
                is.remove();
            }else {
                avg+=i;
            }
        }
        System.out.println(nhietDo);
        System.out.printf("Nhiệt độ trung bình: %.2f",avg/nhietDo.size());
    }

}