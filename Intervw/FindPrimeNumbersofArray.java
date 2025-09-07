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

//i=3 -> first odd number after 2
//i<=Math.sqrt(n) -> prime checking
//i+=2 -> only odd numbers are checked 



//√9 = 3 → so loop runs with i = 3.
//Check → 9 % 3 == 0(divisible).
//That means 9 is not prime → return false.


//√11 ≈ 3.31 → loop runs with i = 3.
//Check → 11 % 3 == 0 (not divisible).
//Loop ends (because next i=4 > √11).
//No divisors found → return true.
//So 11 is prime.