

public class BiggestInterval{
    public static void main(String[] args){
       int[][] intervals={{9,11},{10,16},{15,27}};
     
       int maxDuration =-1;
       int[] biggest = null;
       
       for(int i=0;i<intervals.length;i++){
           int duration = intervals[i][1]-intervals[i][0];
           if(duration>maxDuration){
               maxDuration=duration;
               biggest=intervals[i];
               
           }
       }
       System.out.println(biggest[0]+" "+(biggest[1]%24));
       System.out.println(maxDuration);
    }
}
