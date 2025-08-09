public class LargestNumber {
    public static void main(String[] args) {
        int numbers[]={26,45,11,7895,2,30};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if( numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest is :"+largest);
    }
}
