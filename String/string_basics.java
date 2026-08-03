public class string_basics {
    public static void main(String args[]){
//         1. String literal (Static Memory):- 
//            To make Java more memory efficient (because no new objects are 
//             created if it exists already in the string constant pool). 
        String str = "Ashish";

//         2. Using new keyword (Heap Memory):- 
//            Using the new keyword creates a new object in heap memory, 
//            even if the same string already exists in the pool.
        String str2 = new String("AshisH   ");

        System.out.println(str);
        System.out.println(str2);

        // Methods In String

        // 1:- Length
        System.out.println(str.length());

        // 2:- CharAt()
        System.out.println(str.charAt(3));

        // 3:- Substr()
        System.out.println(str.substring(1, 4));

        // 4:- toUpperCase
        System.out.println(str.toUpperCase());

        // 5:- toLowerCase
        System.out.println(str.toLowerCase());

        // 6:- equals()
        System.out.println(str.equals(str2));

        // 7:- equalsIgnorCase
        System.out.println(str.equalsIgnoreCase(str2));

        // 8:- Contains()
        System.out.println(str.contains("shi"));

        // 9:- trim()
        System.out.println(str2.trim());


    }
}
