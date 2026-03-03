/**
 * OOPSBannerApp
 * UC6: Modular Banner using Helper Methods
 * @author Devna
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Combine characters row by row
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}