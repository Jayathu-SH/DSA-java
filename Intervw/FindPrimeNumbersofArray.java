public class FindPrimeNumbersofArray {
    public static void main(String args[]){

        int numbers[]={2,45,67,89,30,28,10,11};
        
        System.out.print("Prime numbers in the array: ");
        for(int num: numbers){
            if(isPrime(num)){
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n <= 1) return  false;
        if(n == 2) return  true;
        if(n % 2 ==0) return false;
        for(int i = 3; i<=Math.sqrt(n); i+=2){
            if(n % i==0) return false;
        }
        return  true;
    }
    
}
