// public class practice{

    // public static int check(int arr[], int k){

    //     int sum = 0;
    //     int length = 0;
    //     int minLength = Integer.MAX_VALUE;

    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i; j<arr.length; j++){
    //           sum += arr[j];

    //           if(sum >= k){
    //              length = j-i+1;
    //              minLength = Math.min(minLength, length);
    //              sum = 0;
    //              break;
    //           }
    //         }
    //     }
    //     return minLength;
    // }
    // public static void main(String args[]){
    //     int arr[] = {2,3,1,2,4,3};

    //     System.out.println(check(arr, 7));
    // }
// }

public class practice {

    public static int check(int arr[], int k) {

        int sum = 0;
        int length = 0;
        int maxLength = Integer.MAX_VALUE;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= k) {
                length = right - left + 1;
                maxLength = Math.min(maxLength, length);

                sum -= arr[left];
                left++;
            }
        }

        if (maxLength == Integer.MAX_VALUE) {
            return 0;
        }

        return maxLength;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 1, 2, 4, 3 };

        System.out.println(check(arr, 7));
    }
}