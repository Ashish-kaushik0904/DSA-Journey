package sliding_window;

import java.util.HashMap;

public class subarray_with_k_different_integer_992 {
    public static int check(int arr[], int k){
        return atmost(arr, k) - atmost(arr, k-1);
    }

    public static int atmost(int arr[], int k){
        int count = 0;
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right<arr.length; right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);

            while(map.size() > k){
                map.put(arr[left], map.get(arr[left])-1);

                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }

                left++;
            }

            count += right-left+1;
        }

        return count;
    }
    public static void main(String args[]){
        int arr[] = {1,2,1,2,3};

        System.out.println(check(arr, 2));
    }
}


// Brute force 1 ****************************************************************

/* public class subarray_with_k_different_integer_992 {

        public static int check(int arr[], int k){
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
       
        for(int i=0; i<arr.length; i++){
           int j = i;
            while(j < arr.length){
               set.add(arr[j]);
                if(set.size() == k){
                    count++;
                }
                if(set.size() > k){
                    break;
                }

                j++;
            }
            set.clear();
        }
        return count;
    }
    public static void main(String args[]){
         int arr[] = {1,2,1,3,4};

         System.out.println(check(arr, 3));
    }
} */