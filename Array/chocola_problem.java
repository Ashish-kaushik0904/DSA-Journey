import java.util.*;

public class chocola_problem {

    public static int check(int[] x, int[] y) {

        Arrays.sort(x);
        Arrays.sort(y);
        int vcut = 1;
        int hcut = 1;
        int hori = y.length - 1;
        int verj = x.length - 1;
        int sum = 0;

        while (hori >= 0 && verj >= 0) {

            if (y[hori] > x[verj]) {
                sum += y[hori] * vcut;
                hcut++;
                hori--;
            } else {
                sum += x[verj] * hcut;
                vcut++;
                verj--;
            }
        }

        while (hori >= 0) {
            sum += y[hori] * vcut;
            hcut++;
            hori--;
        }

        while (verj >= 0) {
            sum += x[verj] * hcut;
            vcut++;
            verj--;
        }

        return sum;

    }

    public static void main(String args[]) {
        int y[] = { 4, 2, 1 }; // y = horizontal Array
        int x[] = { 4, 3, 2, 1, 1 }; // x = vertical Array

        System.out.println(check(y, x));
    }
}
