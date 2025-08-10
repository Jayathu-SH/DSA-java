public class SecondLargestArr {
    public static void main(String[] args){
        int numbers[]={10,22,5,4,110};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : numbers){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num> secondLargest && num!=largest) {
                secondLargest=num;
            }
        }

          if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}


// Integer.MIN_VALUE when looking for the largest or second-largest value — to safely handle negative numbers too.