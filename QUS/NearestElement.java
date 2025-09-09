
public class NearestElement{
    public static void main(String[] args){
        int numbers[] = {5,3,2,9,8,10};
       
        for(int i=0;i<numbers.length;i++){
            int nearest = -1;
            for(int j = i-1;j>=0;j--){
                if(numbers[j]<numbers[i]){
                    nearest = numbers[j];
                    break;
                }
            }
            System.out.print(nearest+" ");
        }   
    }
}
