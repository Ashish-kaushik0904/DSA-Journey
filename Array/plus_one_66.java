public class plus_one_66 {

    public static int[] increment(int digits[]){
 for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String args[]){
        int digits[] = {9};
        int res[] = increment(digits);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
