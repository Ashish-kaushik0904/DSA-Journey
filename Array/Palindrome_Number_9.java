public class Palindrome_Number_9 {

     public static boolean isPalindrome(int x) {
        int ori = x;
        int rev = 0;

        if(x < 0){
            return false;
        }

        while(x != 0){
            int rem = x%10;
            rev = (rev*10) + rem;
            x = x/10;
        }

        if(rev == ori){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        int x = -121;
        if(isPalindrome(x)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
