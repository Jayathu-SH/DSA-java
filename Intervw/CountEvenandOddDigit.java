public class CountEvenandOddDigit {
    public static void main(String[] args) {
        
        int num = 447382;//odd-3,even-4
        int eventCount = 0;
        int oddCount = 0;

        while (num>0) { 
            int reminder = num % 10;
            if(reminder % 2 ==0){
                eventCount++;
            }else{
                oddCount++;
            }
            num = num/10;//eliminate last digit
        }
        System.out.println(eventCount);
        System.out.println(oddCount);

    }
}
