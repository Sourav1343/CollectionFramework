package org.example;

import java.util.LinkedList;
import java.util.logging.Logger;

public class LinkedListExample {
    private static final Logger logger = Logger.getLogger(LinkedListExample.class.getName());

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        logger.info("Initial LinkedList: " + linkedList);

        // Add element at the first position
        linkedList.addFirst("Mango");
        logger.info("After adding Mango at the first position: " + linkedList);

        // Add element at the last position
        linkedList.addLast("Pineapple");
        logger.info("After adding Pineapple at the last position: " + linkedList);

        // Add element at a specific index
        linkedList.add(2, "Orange");
        logger.info("After adding Orange at index 2: " + linkedList);

        // Add all elements of another collection
        LinkedList<String> otherFruits = new LinkedList<>();
        otherFruits.add("Grapes");
        otherFruits.add("Watermelon");
        linkedList.addAll(otherFruits);
        logger.info("After adding all elements from another collection: " + linkedList);

        // Retrieve the first element
        String firstElement = linkedList.getFirst();
        logger.info("First element of the LinkedList: " + firstElement);

        // Retrieve the last element
        String lastElement = linkedList.getLast();
        logger.info("Last element of the LinkedList: " + lastElement);

        // Check if the LinkedList contains a specific element
        boolean containsOrange = linkedList.contains("Orange");
        logger.info("LinkedList contains Orange: " + containsOrange);

        // Get the size of the LinkedList
        int size = linkedList.size();
        logger.info("Size of the LinkedList: " + size);

        // Remove first and last elements
        String removedFirst = linkedList.removeFirst();
        logger.info("After removing first element (" + removedFirst + "): " + linkedList);

        String removedLast = linkedList.removeLast();
        logger.info("After removing last element (" + removedLast + "): " + linkedList);

        // Clear the LinkedList
        linkedList.clear();
        logger.info("After clearing the LinkedList: " + linkedList);
    }
}
