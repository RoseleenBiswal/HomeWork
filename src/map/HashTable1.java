package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {

        //null is accepted as key and value in HashMap but not allowed in HashTable.
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("City", "Manchester");
        hashMap.put(null, null);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(null));

        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("Country", "India");
        hashTable.put("null","null");
        System.out.println(hashTable.size());

    }
}
