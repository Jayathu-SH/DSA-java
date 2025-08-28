public class FindMissingNumberInArray {
    public static void main(String[] args) {
        
        int numbers[]={1,2,4,5};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum1+=numbers[i];
        }
        System.out.println(sum1);

        for (int i =0;  i <= 5; i++){
            sum2+=i;
        }
        System.out.println(sum2);

        System.out.println("Missing number : "+(sum2-sum1));
    }
}

