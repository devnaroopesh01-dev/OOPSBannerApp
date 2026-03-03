/**
 * OOPSBannerApp
 * UC5: Render OOPS Banner using String.join() inside array initialization
 * @author Devna
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in single statement using String.join()
        String[] banner = {
            String.join("", " ", "*****", "   ", "*****", "   ", "******", "   ", "*****"),
            String.join("", "*", "     * ", "*", "     *  ", "*     * ", "*"),
            String.join("", "*", "     * ", "*", "     *  ", "*     * ", "*"),
            String.join("", "*", "     * ", "*", "     *  ", "******   ", "*****"),
            String.join("", "*", "     * ", "*", "     *  ", "*             ", "*"),
            String.join("", "*", "     * ", "*", "     *  ", "*             ", "*"),
            String.join("", " ", "*****", "   ", "*****", "   ", "*       ", "*****")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}