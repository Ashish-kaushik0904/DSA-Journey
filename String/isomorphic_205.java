import java.util.HashMap;
public class isomorphic_205{

    public static boolean isIsomorphic(String str1, String str2){
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if(map1.containsKey(ch1)){
                if(map1.get(ch1) != ch2){
                   return false;
                }
            }
            else{
                map1.put(ch1, ch2);
            }

            if(map2.containsKey(ch2)){
                if(map2.get(ch2) != ch1){
                    return false;
                }
            }
            else{
                map2.put(ch2, ch1);
            }
        }
        
        return true;
    }
    public static void main(String args[]){
        String str1 = "foo";
        String str2 = "bar";

        if(isIsomorphic(str1, str2)){
            System.out.println("yess, String are Isomorphics: ");
        }
        else{
            System.out.println("Noo, String is not Isomorphics: ");
        }
    }
}