public class MiddleElement {
    public static void main(String[] args) {
        int numbers[]={3,1,6,7,41,8,4};

        int middleIndex = numbers.length/2;

        if(numbers.length % 2 == 0){
            System.out.println("middle: "+numbers[middleIndex-1]+ " and " +numbers[middleIndex]);
        }else{
            System.out.println("middle "+ numbers[middleIndex]);
        }
    }
}

