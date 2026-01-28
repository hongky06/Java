import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Danh sách từ cấm
        String[] blacklist = {"dở tệ", "ngu ngốc", "rác rưởi", "chết tiệt", "lừa đảo"};

        String rawReview = "Tôi thực sự thất vọng về cuốn sách này. Nội dung quá DỞ TỆ và nhạt nhẽo. "
                + "Tác giả viết như kẻ NGU NGỐC, không có chút kiến thức nào. "
                + "Đây đúng là cuốn sách RÁC RƯỞI nhất tôi từng đọc. "
                + "Bìa sách thì xấu, giấy thì mỏng, mực in thì lem luốc. "
                + "Tôi cảm thấy như bị lừa đảo khi bỏ tiền mua nó. "
                + "Đừng ai mua cuốn này nhé, phí tiền lắm, thà đi ăn kem còn sướng hơn. "
                + "Tóm lại là một trải nghiệm kinh khủng!";

        System.out.println("--- NỘI DUNG GỐC ---");
        System.out.println(rawReview);

        String censoredReview = filterBadWords(rawReview, blacklist);

        String finalReview = smartTruncate(censoredReview, 200);

        System.out.println("\n--- NỘI DUNG SAU KHI XỬ LÝ ---");
        System.out.println(finalReview);
    }

    public static String filterBadWords(String text, String[] blacklist) {
        StringBuilder patternBuilder = new StringBuilder();
        for (int i = 0; i < blacklist.length; i++) {
            patternBuilder.append(Pattern.quote(blacklist[i]));
            if (i < blacklist.length - 1) {
                patternBuilder.append("|");
            }
        }
        String regex = "(?ui)(?<!\\p{L})(" + patternBuilder.toString() + ")(?!\\p{L})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            String foundWord = matcher.group();
            String stars = generateStars(foundWord.length());
            matcher.appendReplacement(sb, stars);
        }
        matcher.appendTail(sb);

        return sb.toString();
    }

    public static String smartTruncate(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }
        String temp = text.substring(0, maxLength);
        int lastSpaceIndex = temp.lastIndexOf(" ");
        if (lastSpaceIndex != -1) {
            temp = temp.substring(0, lastSpaceIndex);
        }
        return temp + "...";
    }

    public static String generateStars(int length) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append("*");
        }
        return s.toString();
    }
}