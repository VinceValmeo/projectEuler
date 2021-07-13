public class P4_3DigitPalindrome {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {

        int ans = 0;
      
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                
                int product = i * j;
                
                String stringProd = String.valueOf(product);
                String rev = reverseString(stringProd);
                
                if (stringProd.equals(rev) && product > ans) {
                    ans = product;  
                }
            }
        }
        
        System.out.println(ans);
        System.out.println("Program Done");

    }
}
