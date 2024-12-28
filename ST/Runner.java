package ST;

public class Runner {
    public static void main(String[] args) {
        
        Stack nums = new Stack();
       
        nums.push(15);
        nums.show();
        nums.push(8);
        nums.show();
        nums.push(10);
        nums.show();
        
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.pop());
        System.out.println(nums.size());
        System.out.println(nums.pop());
    }
}
