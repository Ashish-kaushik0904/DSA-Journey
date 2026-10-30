import java.util.HashMap;

public class subarray_sum_selected_by_k_974 {

    public static int check(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int count = 0;
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;
            int reminder = prefixSum % k;

            if (reminder < 0) {
                reminder += k;
            }

            if (map.containsKey(reminder)) {
                count += map.get(reminder);
            }

            map.put(reminder, map.getOrDefault(reminder, 0) + 1);
        }

        return count;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 0, -2, -3, 1 };

        System.out.println(check(arr, 5));
    }
}


// Brute Force ******************************************************************8

/* public class subarray_sum_selected_by_k_974 {

        public static int check(int arr[], int k){

        int count = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];

                if(sum%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {4,5,0,-2,-3,1};

        System.out.println(check(arr, 5));
    }
} */