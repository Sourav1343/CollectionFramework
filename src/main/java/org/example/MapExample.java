package org.example;

import java.util.*;
import java.util.logging.Logger;

public class MapExample {
    private static final Logger logger = Logger.getLogger(MapExample.class.getName());

    public static void main(String[] args) {
        // HashMap example (No order maintained)
        logger.info("Creating a HashMap...");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Cherry");
        hashMap.put(null, "NullKeyExample"); // HashMap allows null key
        logger.info("HashMap: " + hashMap);

        // LinkedHashMap example (Maintains insertion order)
        logger.info("Creating a LinkedHashMap...");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Cherry");
        linkedHashMap.put(4, null); // LinkedHashMap allows null values
        logger.info("LinkedHashMap (Insertion Order Maintained): " + linkedHashMap);

        // TreeMap example (Sorted in ascending order of keys)
        logger.info("Creating a TreeMap...");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");
        // treeMap.put(null, "NullValueExample"); // TreeMap doesn't allow null keys
        logger.info("TreeMap (Sorted Order): " + treeMap);

        // Demonstrating useful Map methods with logging
        logger.info("\n*** Demonstrating Map Methods ***");

        // put() method
        logger.info("Adding entry {5=Orange} to HashMap...");
        hashMap.put(5, "Orange");
        logger.info("Updated HashMap: " + hashMap);

        // putIfAbsent() method
        logger.info("Using putIfAbsent() for key 5...");
        hashMap.putIfAbsent(5, "Grapes"); // Won't replace Orange
        logger.info("HashMap after putIfAbsent: " + hashMap);

        // containsKey() and containsValue() methods
        logger.info("Checking if HashMap contains key 1 and value 'Banana'...");
        boolean containsKey = hashMap.containsKey(1);
        boolean containsValue = hashMap.containsValue("Banana");
        logger.info("HashMap contains key 1: " + containsKey);
        logger.info("HashMap contains value 'Banana': " + containsValue);

        // get() method
        logger.info("Getting value for key 2 from HashMap...");
        String valueForKey2 = hashMap.get(2);
        logger.info("Value for key 2: " + valueForKey2);

        // remove() method
        logger.info("Removing entry with key 3 from LinkedHashMap...");
        linkedHashMap.remove(3);
        logger.info("LinkedHashMap after removal: " + linkedHashMap);

        // keySet() and entrySet() methods
        logger.info("Iterating over keys and entries of TreeMap...");
        for (Integer key : treeMap.keySet()) {
            logger.info("Key: " + key + ", Value: " + treeMap.get(key));
        }

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            logger.info("Entry: " + entry.getKey() + "=" + entry.getValue());
        }

        // clear() method
        logger.info("Clearing TreeMap...");
        treeMap.clear();
        logger.info("TreeMap after clear: " + treeMap);

        // size() method
        logger.info("Size of HashMap: " + hashMap.size());



        //basic function of map

        // Create a HashMap instance
        Map<String, Integer> map = new HashMap<>();

        // put() method
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);
        logger.info("Map after put(): " + map);

        // putAll() method
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Mango", 40);
        newMap.put("Grapes", 25);
        map.putAll(newMap);
        logger.info("Map after putAll(): " + map);

        // putIfAbsent() method
        map.putIfAbsent("Apple", 60); // won't change the value
        logger.info("Map after putIfAbsent(): " + map);

        // remove() method
        map.remove("Banana");
        logger.info("Map after remove(key): " + map);

        // remove(key, value) method
        boolean isRemoved = map.remove("Orange", 35); // will return false, as the value doesn't match
        logger.info("Was 'Orange' removed with value 35? " + isRemoved);

        // keySet() method
        Set<String> keys = map.keySet();
        logger.info("KeySet: " + keys);

        // entrySet() method
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        logger.info("EntrySet: " + entries);

        // clear() method
        Map<String, Integer> tempMap = new HashMap<>(map);
        tempMap.clear();
        logger.info("Map after clear(): " + tempMap);

        // compute() method
        map.compute("Apple", (k, v) -> (v == null) ? 10 : v + 10);
        logger.info("Map after compute(): " + map);

        // computeIfAbsent() method
        map.computeIfAbsent("Pineapple", k -> 15);
        logger.info("Map after computeIfAbsent(): " + map);

        // computeIfPresent() method
        map.computeIfPresent("Apple", (k, v) -> v + 5);
        logger.info("Map after computeIfPresent(): " + map);

        // containsKey() method
        boolean hasKey = map.containsKey("Mango");
        logger.info("Does map contain key 'Mango'? " + hasKey);

        // containsValue() method
        boolean hasValue = map.containsValue(15);
        logger.info("Does map contain value 15? " + hasValue);

        // equals() method
        boolean isEqual = map.equals(newMap);
        logger.info("Are the maps equal? " + isEqual);

        // forEach() method
        logger.info("Map entries using forEach(): ");
        map.forEach((k, v) -> logger.info(k + " -> " + v));

        // get() method
        Integer value = map.get("Apple");
        logger.info("Value for key 'Apple': " + value);

        // getOrDefault() method
        Integer defaultValue = map.getOrDefault("Peach", 10);
        logger.info("Value for key 'Peach' or default: " + defaultValue);

        // hashCode() method
        int hashCode = map.hashCode();
        logger.info("Hash code of the map: " + hashCode);

        // isEmpty() method
        boolean isEmpty = map.isEmpty();
        logger.info("Is map empty? " + isEmpty);

        // merge() method
        map.merge("Mango", 10, (oldVal, newVal) -> oldVal + newVal);
        logger.info("Map after merge(): " + map);

        // replace() method
        map.replace("Mango", 50);
        logger.info("Map after replace(key, value): " + map);

        // replace(key, oldValue, newValue) method
        boolean replaced = map.replace("Mango", 50, 60);
        logger.info("Was 'Mango' replaced with value 60? " + replaced);

        // replaceAll() method
        map.replaceAll((k, v) -> v * 2);
        logger.info("Map after replaceAll(): " + map);

        // values() method
        Collection<Integer> values = map.values();
        logger.info("Values: " + values);

        // size() method
        int size = map.size();
        logger.info("Size of the map: " + size);
    }





}

