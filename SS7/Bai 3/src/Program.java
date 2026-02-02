public class Program {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};

        double average = ScoreUtils.calculateAverage(scores);
        System.out.println("Điểm trung bình: " + average);


        for (int i = 0; i < scores.length; i++) {
            if (ScoreUtils.checkPass(scores[i])) {
                System.out.println(scores[i] + " -> Đạt");
            } else {
                System.out.println(scores[i] + " -> Trượt");
            }
        }
    }
}
