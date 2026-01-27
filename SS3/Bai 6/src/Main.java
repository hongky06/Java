import java.util.*;


public class Main {


    // Hàm gộp 2 mảng, loại trùng, giữ tăng dần
    static int[] mergeBooks(int[] a, int[] b) {


// 1. Tạo TreeSet
// TreeSet KHÔNG cho trùng + TỰ sắp xếp tăng dần
        Set<Integer> set = new TreeSet<>();


// 2. Thêm toàn bộ phần tử mảng a vào set
        for (int x : a) {
            set.add(x);
        }


// 3. Thêm toàn bộ phần tử mảng b vào set
// Nếu trùng → TreeSet tự bỏ qua
        for (int x : b) {
            set.add(x);
        }


// 4. Tạo mảng kết quả có kích thước = số phần tử trong set
        int[] result = new int[set.size()];


// 5. Chuyển dữ liệu từ set sang mảng
        int i = 0;
        for (int x : set) {
            result[i++] = x;
        }


// 6. Trả về mảng kết quả
        return result;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 3, 5, 6, 8, 9, 10};


// Gọi hàm và in kết quả
        System.out.println(Arrays.toString(mergeBooks(a, b)));
    }
}