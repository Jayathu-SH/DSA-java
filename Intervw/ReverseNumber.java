
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter ypur prefer number : ");
//         int num = sc.nextInt();

//         int reversed = 0;
//         while (num != 0){
//             int digit = num % 10;//get last digit
//             reversed = reversed*10 + digit;//buid reversed number
//             num = num / 10;//remove last element
//         } 
//         System.out.println("reversed number : " + reversed);
//     }
// }

public class ReverseNumber {
    public static void main(String[] args) {
        
        int num = 4567;
        int reversed = 0;
        
        while (num != 0){
            int digit = num % 10;//get last digit
            reversed = reversed*10 + digit;//buid reversed number
            num = num / 10;//remove last element
        } 
        System.out.println("reversed number : " + reversed);
    }
}

