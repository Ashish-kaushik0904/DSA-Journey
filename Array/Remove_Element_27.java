public class Remove_Element_27{

    public static int remove_ele(int arr[], int val){
        int k = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String args[]){
        int arr[] = {3,2,2,3};
        System.out.println(remove_ele(arr, 3));
    }
}