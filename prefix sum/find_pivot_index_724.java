public class find_pivot_index_724 {
    
    public static int check(int arr[]){
        
        int totalSum = 0;
        int lsum = 0;
        int rsum = 0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }

        for(int i=0; i<arr.length; i++){
            rsum = totalSum - lsum - arr[i];

            if(lsum == rsum){
                return i;
            }

            lsum += arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,7,3,6,5,6};

        System.out.println(check(arr));
    }
}


// Brute Force ************************************************************

/* public class find_pivot_index_724 {
    
        public static int check(int arr[]){

        for(int i=0; i<arr.length; i++){

        int lsum = 0;
        int rsum = 0;
            for(int j=i-1; j>=0; j--){
                lsum += arr[j];
            }

            for(int k=i+1; k<arr.length; k++){
                rsum += arr[k];
            }

            if(lsum == rsum){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,7,3,6,5,6};

        System.out.println(check(arr));
    }
} */