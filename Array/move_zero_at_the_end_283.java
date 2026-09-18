public class move_zero_at_the_end_283 {

    public static void move_zero(int arr[]){
        int zero = 0;
        int k = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }

            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        int start = arr.length - zero;

        for(int i=start; i<arr.length; i++){
            arr[i] = 0;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};
        move_zero(arr);
    }
}
