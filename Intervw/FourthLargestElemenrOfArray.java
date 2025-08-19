public class FourthLargestElemenrOfArray {
    public static void main(String[] args){
        int numbers[]={10,22,5,4,110};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;
        int fourthLargest = Integer.MIN_VALUE;

        for(int num : numbers){
            if(num > largest){
                fourthLargest=thirdlargest;
                thirdlargest=secondLargest;
                secondLargest=largest;
                largest=num;
            }else if(num > secondLargest && num != largest){
                fourthLargest=thirdlargest;
                thirdlargest=secondLargest;
                secondLargest=num;
            }else if(num > thirdlargest && num != largest && num != secondLargest){
                fourthLargest=thirdlargest;
                thirdlargest=secondLargest;
            }else if(num > fourthLargest && num != largest && num != secondLargest && num != thirdlargest){
                fourthLargest=thirdlargest;
            }
        }

          if (fourthLargest == Integer.MIN_VALUE) {
            System.out.println("There is no fourth largest number.");
        } else {
            System.out.println("Fourth largest number is: " + fourthLargest);
        }
    }
}














