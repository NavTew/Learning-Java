import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(1);

        System.out.println(s);

        //Search is faster
        //when we add, value goes through hash function
        //This generates and index
        //So inside the implementation of a set there is an array only
        //We get the index fast

        s.add(5);
        s.add(25);
        s.add(4);
        s.add(80);
        s.add(11);


        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(89);
        s2.add(67);
        //Linked HashSet maintains the order of insertion

        System.out.println(s);
        System.out.println(s2);


//        HashSet is based on a hash table.
//                add(), remove(), contains(): O(1) on average. The worst-case is O(n) in
//                rare collision scenarios, but modern Java implementations use balanced trees
//                to mitigate this to O(log n) when bucket size exceeds a certain threshold.

//           LinkedHashSet average-case constant time complexity, O(1), for basic operations like
//            add(), remove(), and contains(), assuming a good hash function.
//            Worst-Case Scenario: if many elements have the same hash code (a collision), operations
//            can degrade to O(n) time complexity as the system needs to traverse a linked list or balanced
//            tree of colliding elements.

    }
}
