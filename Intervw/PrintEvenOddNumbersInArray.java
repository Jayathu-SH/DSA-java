public class PrintEvenOddNumbersInArray {
    public static void main(String[] args) {
        int numbers[]={2,34,5,6,7,89,10};
        

        System.out.println("Even numbers");
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 == 0){
                    System.out.println(numbers[i]);
                }
            }

            System.out.println("Odd numbers");
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i]%2 != 0){
                        System.out.println(numbers[i]);
                    }
                }
        }
    }

