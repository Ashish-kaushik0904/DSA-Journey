package sliding_window;

import java.util.HashSet;
public class max_sum_2461{

    public static int maxsum(int arr[], int k){
        int i=0;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        for(int j=0; j<arr.length; j++){

            while(set.contains(arr[j])){
                set.remove(arr[i]);
                currsum -= arr[i];
                i++;
            }

            set.add(arr[j]);
            currsum += arr[j];

            if(j-i+1 == k){
                maxsum = Math.max(maxsum, currsum);
                set.remove(arr[i]);
                currsum -= arr[i];
                i++;
            }
        }

        return maxsum;
    }
    public static void main(String args[]){
        int arr[] = {2,5,5,2,8,9};
        System.out.println(maxsum(arr, 3));
    }
}