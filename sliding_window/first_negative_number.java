package sliding_window;

import java.util.LinkedList;
import java.util.Queue;

public class first_negative_number {
     public static void negative(int arr[], int k){
        int i = 0;
        int j = 0;

        Queue<Integer> q = new LinkedList<>();

        while(j < arr.length){
            if(arr[j] < 0){
                q.add(j);
            }

            if(j-i+1 == k){

                while(!q.isEmpty() && q.peek() < i){
                    q.poll();
                }

                if(q.isEmpty()){
                    System.out.print("0 ");
                }
                else{
                    System.out.print(arr[q.peek()]+" ");
                }

                i++;
            }
            j++;
        }
    }
    public static void main(String args[]){
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        negative(arr, 3);
    }
}


// Brute force***********************************************

// public class first_negative_number{

//     public static void window(int arr[], int k){
//         int m = 0;
//         int j = k-1;

//         while(j<arr.length){

//             boolean found = true;
//             for(int i=m; i<=j; i++){
//                 if(arr[i] < 0){
//                     System.out.print(arr[i]+" ");
//                     found = false;
//                     break;
//                 }
//             }

//             if(found){
//                 System.out.print("0 ");
//             }

//             j++;
//             m++;
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {12,-1,-7,8,-15,30,16,28};
//         window(arr, 3);
//     }
// }
