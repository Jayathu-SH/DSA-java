

public class SecondSmallestArr {
    public static void main(String[] args) {
        int numbers[]={10,22,5,4,110};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

         for(int num : numbers){
            if(num<smallest){
                secondSmallest=smallest;
                smallest=num;
            }else if (num< secondSmallest && num!=smallest) {
                secondSmallest=num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest number.");
        } else {
            System.out.println("Second smallest number is: " + secondSmallest);
        }
    }
}
    

//Integer.MAX_VALUE to make sure that any number in the array will be smaller than the initial value(2,147,483,647)
