public class practice{

    public static void main(String args[]){
      int decimal = 7;
      int bin = 0;
      int i = 0;

      while(decimal > 0){
        int lastdigit = decimal%2;
        bin = bin + lastdigit * (int)Math.pow(10, i);
        decimal /= 2;
        i++;
      }

      System.out.println(bin);
    }
}