package sliding_window;

public class subarray_product_less_then_k_713 {
    public static int check(int arr[], int k){

        int count = 0;
        int prod = 1;
        int left = 0;

        for(int right=0; right<arr.length; right++){
            prod *= arr[right];

            while(prod >= k){
               prod /= arr[left];
               left++;
            }

            count += right-left+1;
        }

        return count;
    }
    public static void main(String args[]){
        int arr[] = {10,5,2,6};

        System.out.println(check(arr, 100));
    }
}


// Brute Force **************************************************************************

/* public class subarray_product_less_then_k_713 {

        public static int check(int arr[], int k) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = i; j >= 0; j--) {
                prod *= arr[j];

                if (prod < k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3 };

        System.out.println(check(arr, 0));
    }
} */

