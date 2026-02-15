import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args){


        ArrayList<Integer> a = new ArrayList<>(); //makes an array of size 10
        //whenever it gets full , new array gets made
        //of size 1.5 * 10

        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("array list a: " + a);

        //can use parent class name also
        List<Integer> b = new ArrayList<>();

        b.add(1);
        b.add(2);
        b.add(3);

        System.out.println("array list b: " + b);

        a.addAll(b);

        System.out.println("array list a: " + a);

        System.out.println("Does a contain 2? " + a.contains(2));
        System.out.println("What is at position 3? " + a.get(3));



        //now parent class is List
        //we can implement LinkedList with same methods and same
        //code altogether , by still having parent class as List

        List<Integer> c = new LinkedList();
        //There is no array in this
        //These guys (1, 2, 3, 13 etc ...) are nodes in the LL
        //So it is also storing pointer to next

        c.add(1);
        c.add(2);
        c.add(3);

        c.add(13);
        c.add(13);

        c.add(13);
        c.add(13);

        c.add(13);
        c.add(13);

        c.add(13);
        c.add(13);

        c.add(13);
        c.add(13);



        //In List, search will be linear



//        ArrayList is backed by a dynamic array.
//                get(index): O(1) (constant time) because of direct index access.
//                add() (at the end): O(1) on average, but O(n) in the worst case
//                when the array must be resized and re-copied.
//                add(index, element) or remove() (from middle/beginning): O(n) because
//                subsequent elements need to be shifted.


//        LinkedList uses a doubly-linked list.
//                addFirst(), addLast(), removeFirst(), removeLast(): O(1).
//                get(index) or contains(): O(n) because it requires traversing
//                the list from one end to find the element or index.

    }
}
