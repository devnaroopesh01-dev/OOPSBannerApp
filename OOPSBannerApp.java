/**
 * OOPSBannerApp
 * UC4: Render OOPS Banner using String Array and Loop
 * @author Devna
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in String array
        String[] banner = {
            " *****   *****   ******   *****",
            "*     * *     *  *     * *",
            "*     * *     *  *     * *",
            "*     * *     *  ******   *****",
            "*     * *     *  *             *",
            "*     * *     *  *             *",
            " *****   *****   *       *****"
        };

        // Loop through array and print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}