public class SortOfElement {
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6};
        boolean isSorted = true;

        for (int i = 0; i < numbers.length-1; i++) {//compare with next element->length-1
            if(numbers[i] > numbers[i+1]){
                isSorted = false;
                break;
        } 
    }
    System.out.println(isSorted);
    }
}



