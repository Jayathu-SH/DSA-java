public class SmallestNumber {
    public static void main(String[] args) {
        int numbers[]={10,85,62,4,73,58};

        int smallest=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: "+ smallest);
    }
}
