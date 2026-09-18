public class two_sum_167 {

    public static int[] sum(int numbers[], int target){
        int j = numbers.length-1;
        int res[] = new int[2];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] + numbers[j] == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                j--;
            }
        }

        return res;
    }
    public static void main(String args[]){
        int numbers[] = {2,7,11,15};

        int res1[] = sum(numbers, 9);

        for(int i=0; i<res1.length; i++){
            System.out.print(res1[i]+" ");
        }
    }
}
