package sliding_window;

public class max_consecutive_ones_1004 {

    public static int check(int arr[], int k) {
       int left = 0;
        int count = 0;
        int window = 0;

        for(int right=0; right<arr.length; right++){
            window += arr[right];

            while(window < right - left + 1-k){
                window -= arr[left];
                left++;
            }

            count = Math.max(count, right - left + 1);
        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 0, 1, 1, 0 };

        System.out.print(check(arr, 2));
    }
}
