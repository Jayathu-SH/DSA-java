import java.util.HashSet;
import java.util.Set;

public class RemoveAndFindDuplicateElementOfArray {
    public static void main(String[] args) {
        
        int numbers[] ={29,47,30,12,47,47,30,44};

        Set<Integer> unique = new HashSet<>();//creates a set to store unique elements from the array
        Set<Integer> duplicates = new HashSet<>();//creates a set to store elements that appear more than once (duplicates).

        for(int num : numbers){
            if(!unique.add(num)){//add(num)->If num is not already in the set, it gets added and the method returns true.
                                 //If num is already in the set, it does not get added and the method returns false.
                duplicates.add(num);
            }//.add -> method in HashSet for duplicate handling
        }
        System.out.println("Unique: "+unique);
        System.out.println("Duplicates :"+duplicates);
    }
}

//new HashSet<>() creates a new, empty HashSet in Java.
//HashSet is a collection, stores unique elements and does not allow duplicates.