public class Palindrome{
    public static void main(String[] args){
        String str = "madam";
        String rev = "";
        
        
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
            
        }
            boolean equal = str.equals(rev);
        
        System.out.println(equal);
        
    }
}
// public class Palindrome{
//     public static void main(String[] args){
//         String str = "madam";
//         String rev = new StringBuilder(str).reverse().toString();
//         System.out.println(str.equals(rev));
        
//     }
// }


// StringBuilder: single-thread
// StringBuffer: Only when you need thread safety in multi-threaded environments