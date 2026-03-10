/**
 * OOPSBannerApp UC3 – Banner Application using String.join()
 *
 * Refactors UC2 by replacing string concatenation (+)
 * with String.join() while producing the same banner output.
 *
 * @author Vaishnavi
 * @version 3.0
 */

public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        System.out.println(String.join(" ", "   ***  ", "    ***  ", " ****** ", "    ***** "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **     "));
        System.out.println(String.join(" ", "**     **", "**     **", "**    ** ", "**     "));
        System.out.println(String.join(" ", "**     **", "**     **", "****** ", "    ***** "));
        System.out.println(String.join(" ", "**     **", "**     **", "**     ", "         **"));
        System.out.println(String.join(" ", "**     **", "**     **", "**     ", "          **"));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**     ", "         ** "));
        System.out.println(String.join(" ", "   ***  ", "    ***  ", " **     ", "    ***** "));
        System.out.println(String.join(" ", "       ", "       ", "      ", "       "));
    }
}