import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for (T item : listA) {

            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> khoaNoi1 = Arrays.asList(101, 102, 105);
        List<Integer> khoaNgoai1 = Arrays.asList(102, 105, 108);
        List<Integer> result1 = findCommonPatients(khoaNoi1, khoaNgoai1);
        System.out.println("Test Case 1 Output: " + result1);

        List<String> khoaNoi2 = Arrays.asList("DN01", "DN02", "DN03");
        List<String> khoaNgoai2 = Arrays.asList("DN02", "DN04");
        List<String> result2 = findCommonPatients(khoaNoi2, khoaNgoai2);
        System.out.println("Test Case 2 Output: " + result2);
    }
}