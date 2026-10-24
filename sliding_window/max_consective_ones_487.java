package sliding_window;

public class max_consective_ones_487 {
    public static int check(int arr[]) {
        int left = 0;
        int count = 0;
        int window = 0;

        for (int right = 0; right < arr.length; right++) {
            window += arr[right];
            int length = right - left + 1;

            if (!(window == length || window == length - 1)) {
                window -= arr[left];
                left++;
            }

            count = Math.max(count, length);
        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 0, 1, 1, 0 };

        System.out.print(check(arr));
    }
}
