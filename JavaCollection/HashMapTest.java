import java.util.HashMap;
import java.util.Map;

class HashMapTest{
    public static void main(String[] args){
        int hashcode;
        String key;
        double value;
        int index, capacity =16;

        HashMap<String, Double> map = new HashMap<>(); //initialize a hashmap

        map.put("key1", 1.0); // add entry with key "key1" and value 1.0
        map.put("key2", 2.0); // add entry with key "key2" and value 2.0
        map.put("key3", 3.0); // add entry with key "key3" and value 3.0

        for (Map.Entry<String, Double> e : map.entrySet()){ //enumarate
            key = e.getKey();
            value = e.getValue();
            hashcode = e.hashCode();
            index = hashcode & (capacity-1);

            System.out.println("Key: "+key+" Value: "+value + " HashCode: "+ hashcode+" Index: "+index);
        }
    }
}
