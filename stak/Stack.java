package stak;

public class Stack {
    int stack[] = new int[5]; 
    int top = 0; 

    public void push(int data) {
        if (top < stack.length) { 
            stack[top] = data; 
            top++; 
        } else {
            System.out.println("Stack Overflow"); // full
        }

        //public int pop()
        // {
        //     int data;
        //     top--;
        //     data = stack[top];
        //       stack[top] = 0;
         //     return data;
        // }



        //public int peek()
        // {
        //     int data;
        //     data = stack[top-1];
         //     return data;
        // }

        
    }

    public void show() {
        for (int i = 0; i < top; i++) { 
            System.out.print(stack[i] + " "); 
        }
        System.out.println(); 
    }
}
