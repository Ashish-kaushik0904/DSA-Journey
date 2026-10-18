public class palindrom_2 {
     public static boolean match(String str){
        // String[] arr = str.split(" ");

        int i=0;
        int j = str.length()-1;

        while(i<j){
           if(!Character.isLetter(str.charAt(i))){
            i++;
            continue;
           }

           if(!Character.isLetter(str.charAt(j))){
            j--;
            continue;
           }

           if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
              return false;
           }

           i++;
           j--;
        }

        return true;
    }
    public static void main(String args[]){
        String str = "a man, a plan, a canal: panama";

        if(match(str)){
            System.out.println("yess palindrom: ");
        }
        else{
            System.out.println("Noo palindrom: ");
        }
    }
}
