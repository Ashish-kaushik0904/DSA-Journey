// public class practice{

//     public static int maxsum(int arr[]){
//         int i = 0;
//         int j = i+1;
//         int k = j+1;
//         int cursum = 0;
//         int maxsum = 0;

//         while(k<arr.length){
//             cursum = arr[i] + arr[j] + arr[k];

//             if(cursum > maxsum){
//                 maxsum = cursum;
//             }

//             i++; j++; k++;
//         }

//         return maxsum;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,5,1,8,2,9,1};

//         System.out.println(maxsum(arr));
//     }
// }

// public class practice{

//     public static int maxsum(int arr[], int k){
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;
//         int j = 0;

//         for(int i=0; i<arr.length; i++){
//            currsum += arr[i];

//            if(i >= (k-1)){
//              if(currsum > maxsum){
//                 maxsum = currsum;
//              }

//              currsum -= arr[j];
//              j++;
//            }
//         }

//         return maxsum;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,5,1,8,2,9,1};

//         System.out.println(maxsum(arr, 3));
//     }
// }

// public class practice{

//     public static int summax(int arr[], int k){
//         int i = 0;
//         int j = 0;
//         int currsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         if(k<0 || k>arr.length){
//             return -1;
//         }

//         while(j < arr.length){
//             currsum += arr[j];

//             if(j-i+1 == k){
//                 if(currsum > maxsum){
//                     maxsum = currsum;
//                 }

//                 currsum -= arr[i];
//                 i++;
//             }
//             j++;
//         }

//         return maxsum;
//     }
//     public static void main(String args[]){
//         int arr[] = {2,5,1,8,2,9,1};
//         System.out.println(summax(arr, 3));
//     }
// }

import java.util.HashSet;
public class practice{

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