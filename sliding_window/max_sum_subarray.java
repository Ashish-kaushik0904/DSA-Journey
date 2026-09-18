package sliding_window;

public class max_sum_subarray {

    public static int window(int arr[], int k) {
        int i = 0;
        int j = 0;
        int size = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return 0;
        }

        while (j < size) {

            sum = sum + arr[j];

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];

                i++;
                j++;
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 5, 2, 3, 2, 1 };

        System.out.println(window(arr, 3));
    }
}
