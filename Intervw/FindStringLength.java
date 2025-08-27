// public class FindStringLength {
//     public static void main(String[] args) {
        
//         String givenString = "jayes abka";
//         System.out.println(givenString.length());
//     }
// }

public class FindStringLength{
    public static void main(String[] args) {
        String giveString = "bdiuvhiuwkjnwdc";

        char [] charArray = giveString.toCharArray();

        int length = 0;
        for(Character c : charArray){
            length++;
        }
        System.out.println(length);
    }
}
