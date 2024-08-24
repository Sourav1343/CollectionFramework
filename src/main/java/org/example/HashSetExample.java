package org.example;

import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Logger;

public class HashSetExample {
    private static final Logger logger = Logger.getLogger(HashSetExample.class.getName());

    public static void main(String[] args) {
        // 1. Default HashSet
        HashSet<String> defaultSet = new HashSet<>();
        logger.info("Created a default HashSet: " + defaultSet);

        // 2. HashSet with initial capacity
        HashSet<String> capacitySet = new HashSet<>(10);
        logger.info("Created a HashSet with initial capacity of 10: " + capacitySet);

        // 3. HashSet with initial capacity and load factor
        HashSet<String> capacityLoadFactorSet = new HashSet<>(10, 0.75f);
        logger.info("Created a HashSet with initial capacity of 10 and load factor of 0.75: " + capacityLoadFactorSet);

        // 4. HashSet initialized with a Collection
        HashSet<String> collectionSet = new HashSet<>();
        collectionSet.add("Apple");
        collectionSet.add("Banana");
        collectionSet.add("Cherry");

        HashSet<String> collectionInitializedSet = new HashSet<>(collectionSet);
        logger.info("Created a HashSet initialized with another collection: " + collectionInitializedSet);

        // Demonstrating methods of HashSet

        // Add elements
        collectionInitializedSet.add("Date");
        logger.info("Added 'Date' to HashSet: " + collectionInitializedSet);

        // Add an element that already exists
        boolean added = collectionInitializedSet.add("Apple");
        logger.info("Attempted to add 'Apple' again: " + (added ? "Added" : "Already present"));

        // Check if the set contains a specific element
        boolean containsBanana = collectionInitializedSet.contains("Banana");
        logger.info("HashSet contains 'Banana': " + containsBanana);

        // Check if the set is empty
        boolean isEmpty = collectionInitializedSet.isEmpty();
        logger.info("HashSet is empty: " + isEmpty);

        // Get the size of the HashSet
        int size = collectionInitializedSet.size();
        logger.info("Size of HashSet: " + size);

        // Remove an element from the HashSet
        boolean removed = collectionInitializedSet.remove("Cherry");
        logger.info("Attempted to remove 'Cherry': " + (removed ? "Removed" : "Not found"));

        // Clear all elements from the HashSet
        collectionInitializedSet.clear();
        logger.info("Cleared all elements from the HashSet. Current set: " + collectionInitializedSet);

        // Check if the set is empty after clearing
        isEmpty = collectionInitializedSet.isEmpty();
        logger.info("HashSet is empty after clearing: " + isEmpty);

        // Clone the HashSet
        HashSet<String> clonedSet = (HashSet<String>) collectionSet.clone();
        logger.info("Cloned HashSet: " + clonedSet);

        // Add elements again to demonstrate iteration
        collectionSet.add("Elderberry");
        collectionSet.add("Fig");

        // Iterate over the HashSet
        logger.info("Iterating over the HashSet:");
        Iterator<String> iterator = collectionSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            logger.info("Element: " + element);
        }

        // Use spliterator (available from Java 8)
        logger.info("Spliterating over the HashSet:");
        collectionSet.spliterator().forEachRemaining(element -> logger.info("Spliterator Element: " + element));
    }
}
