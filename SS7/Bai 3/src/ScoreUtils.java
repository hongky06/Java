public class ScoreUtils {

    // Kiểm tra đạt hay trượt
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

}
