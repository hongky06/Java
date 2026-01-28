public class Main {
    static void main(String[] args){
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";
        processLibraryData(description);
    }
    public static void processLibraryData(String text) {
        String keyword = "Kệ:";
        int indexKeyword = text.indexOf(keyword);
        if (indexKeyword != -1) {
            int startPos = indexKeyword + keyword.length();
            int commaPos = text.indexOf(",", startPos);
            String shelfCode;
            if (commaPos != -1) {
                shelfCode = text.substring(startPos, commaPos);
            }
            else {
                shelfCode = text.substring(startPos);
            }
            System.out.println("Vị trí tìm thấy: [" + shelfCode.trim() + "]");
            String newDescription = text.replace(keyword, "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: " + newDescription);

        } else {
            System.out.println("Không tìm thấy thông tin kệ sách!");
        }
    }
}