public class ArrayContainElementOrNot {
    public static void main(String[] args) {
        int numbers[] = {1,5,6,7,2,3,9};
        int numberToFind = 30;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==numberToFind){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(numberToFind+" is present in the array.");
        }else{
            System.out.println(numberToFind+" is not the array.");
        }
    }
}
