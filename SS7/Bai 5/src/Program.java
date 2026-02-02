public class Program {
    public static void main(String[] args) {

        double score = 8.5;

        if (score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm không hợp lệ");
        }
    }
}
