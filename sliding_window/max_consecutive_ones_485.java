package sliding_window;

// Way 1 Normal Approach
/* public class max_consecutive_ones_485 {

     public static int maximum(int arr[]) {
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
            }
        }

        return maxcount;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 1,1,0, 1, 1, 1 };

        System.out.println(maximum(arr));
    }
} */

// Way 2 Sliding Window

public class max_consecutive_ones_485 {

    public static int check(int arr[]) {
        int i = 0;
        int j = 0;
        int maxcount = 0;

        while (j < arr.length) {
            if (arr[j] == 1) {
                int length = j - i + 1;
                maxcount = Math.max(maxcount, length);
            } else {
                i = j + 1;
            }

            j++;
        }

        return maxcount;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 1, 0, 1, 1, 1 };

        System.out.print(check(arr));
    }
}
