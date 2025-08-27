public class CountNumberofDigitsinANumber {
    public static void main(String[] args) {
        int num = 568778;
        int count = 0;

        while (num > 0) { 
            num = num/10;//remove the last digit.
            count++;
        }

        System.out.println("Number of digits : "+count);
    }
}
