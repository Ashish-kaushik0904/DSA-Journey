// package prefix sum;
import java.util.*;

public class subarray_sum_equal_k_560 {
     public static int check(int arr[], int k){
       HashMap<Integer, Integer> map = new HashMap<>();

       int count = 0;
       int sum = 0;
       map.put(0,1);

       for(int n : arr){
        sum += n;
        int target = sum - k;

        if(map.containsKey(target)){
            count += map.get(target);
        }

        map.put(sum, map.getOrDefault(sum, 0)+1);
       }

       return count;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3};
        System.out.println(check(arr, 3));
    }
}


// Brute force Approach *************************************************************

/* import java.util.*;

public class subarray_sum_equal_k_560 {

         public static int check(int arr[], int k){

        int count = 0;

        for(int i=0; i<arr.length; i++){

             int sum = 0;
            for(int j=i; j<arr.length; j++){
               sum += arr[j];

               if(sum == k){
                 count++;
               }
            }
        }

        return count;
    }
    public static void main(String args[]){
        int arr[] = {1,1,1};

        System.out.println(check(arr, 2));
    }
} */