import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    private static final Map<Character, String[]> patternLibrary = new HashMap<>();

    static {

        patternLibrary.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternLibrary.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternLibrary.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    public static void main(String[] args) {

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternLibrary.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}