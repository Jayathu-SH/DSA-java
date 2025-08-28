public class SumofDigitsInaNumber {
    public static void main(String[] args) {
        int num = 125687;
        int sum = 0;

        while (num>0) { 
            int reminder = num%10;
            sum += reminder;   
            num = num/10;
        }
        System.out.println(sum);
    }
    
}
