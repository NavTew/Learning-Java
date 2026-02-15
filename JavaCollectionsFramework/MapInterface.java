import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args){
        Map<Integer, String> mp = new HashMap<>();

        mp.put(1,"a");
        mp.put(2,"b");
        mp.put(3,"c");
        mp.put(45,"d");
        mp.put(5,"e");
        mp.put(6,"f");
        //Order not maintained

        System.out.println(mp);
        System.out.println(mp.get(3));


        Map<Integer, String> mp2 = new LinkedHashMap<>();

        mp2.put(1,"a");
        mp2.put(2,"b");
        mp2.put(45,"c");
        mp2.put(4,"d");
        mp2.put(89,"e");
        mp2.put(6,"f");
        //Order not maintained

        System.out.println(mp2);
        System.out.println(mp2.get(45));

//
//        HashMap is based on a hash table.
//                put(), get(), remove(), containsKey(): O(1) on average. Like HashSet,
//                the worst case is O(n), but modern Java uses balanced trees for large
//                collision chains, making the worst case closer to O(log n).

//        LinkedHashMap: The LinkedHashMap in Java offers O(1) (constant time) complexity on
//            average for basic operations like get(), put(), containsKey(), and remove().
//            O(n) in worst case for all

    }
}
