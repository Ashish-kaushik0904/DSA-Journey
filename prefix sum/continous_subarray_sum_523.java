import java.util.HashMap;

public class continous_subarray_sum_523 {
    
    public static boolean check(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum%k)) {

                int index = map.get(sum%k);

                if(i-index > 2){
                    return true;
                }
            }
            else{
                map.put(sum%k, i);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 23, 2, 4, 6, 7 };

        System.out.println(check(arr, 6));
    }
}
