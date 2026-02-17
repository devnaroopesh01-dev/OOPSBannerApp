/**
 * OOPSBannerApp
 * UC3: Render OOPS Banner using String.join()
 * @author Devna
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String banner = String.join("\n",
            " *****   *****   ******   *****",
            "*     * *     *  *     * *",
            "*     * *     *  *     * *",
            "*     * *     *  ******   *****",
            "*     * *     *  *             *",
            "*     * *     *  *             *",
            " *****   *****   *       *****"
        );

        System.out.println(banner);

    }
}
