package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class ListComparisonExample {
    private static final Logger logger = Logger.getLogger(ListComparisonExample.class.getName());

    public static void main(String[] args) {
        // Creating an ArrayList and LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Populating both lists
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Log the initial state of both lists
        logger.info("Initial ArrayList: " + arrayList);
        logger.info("Initial LinkedList: " + linkedList);

        // Measure and log time taken for adding elements at the end
        long arrayListStartTime = System.nanoTime();
        arrayList.add("Orange");
        long arrayListEndTime = System.nanoTime();
        logger.info("Time taken to add element to ArrayList: " + (arrayListEndTime - arrayListStartTime) + " ns");

        long linkedListStartTime = System.nanoTime();
        linkedList.add("Orange");
        long linkedListEndTime = System.nanoTime();
        logger.info("Time taken to add element to LinkedList: " + (linkedListEndTime - linkedListStartTime) + " ns");

        // Measure and log time taken for inserting elements at the beginning
        arrayListStartTime = System.nanoTime();
        arrayList.add(0, "Grapes");
        arrayListEndTime = System.nanoTime();
        logger.info("Time taken to insert element at the beginning of ArrayList: " + (arrayListEndTime - arrayListStartTime) + " ns");

        linkedListStartTime = System.nanoTime();
        linkedList.add(0, "Grapes");
        linkedListEndTime = System.nanoTime();
        logger.info("Time taken to insert element at the beginning of LinkedList: " + (linkedListEndTime - linkedListStartTime) + " ns");

        // Measure and log time taken to remove elements from the list
        arrayListStartTime = System.nanoTime();
        arrayList.remove(0);
        arrayListEndTime = System.nanoTime();
        logger.info("Time taken to remove element from the beginning of ArrayList: " + (arrayListEndTime - arrayListStartTime) + " ns");

        linkedListStartTime = System.nanoTime();
        linkedList.remove(0);
        linkedListEndTime = System.nanoTime();
        logger.info("Time taken to remove element from the beginning of LinkedList: " + (linkedListEndTime - linkedListStartTime) + " ns");

        // Retrieve elements at a specific index
        String arrayListElement = arrayList.get(1);
        logger.info("Element at index 1 in ArrayList: " + arrayListElement);

        String linkedListElement = linkedList.get(1);
        logger.info("Element at index 1 in LinkedList: " + linkedListElement);

        // Log the final state of both lists
        logger.info("Final ArrayList: " + arrayList);
        logger.info("Final LinkedList: " + linkedList);

        // Recommendations based on the performance and usage
        logger.info("Recommendations:");
        logger.info("Use ArrayList when:");
        logger.info(" - You need fast access to elements with index-based retrieval.");
        logger.info(" - You are mostly performing read operations.");
        logger.info(" - Memory consumption is a concern and you want a contiguous memory layout.");

        logger.info("Use LinkedList when:");
        logger.info(" - You need frequent insertions and deletions at the beginning or middle of the list.");
        logger.info(" - You need to implement a queue or stack data structure.");
        logger.info(" - Performance of adding or removing elements is more critical than access time.");
    }
}
