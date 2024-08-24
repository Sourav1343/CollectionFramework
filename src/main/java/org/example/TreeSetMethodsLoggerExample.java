package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreeSetMethodsLoggerExample {
    private static final Logger logger = Logger.getLogger(TreeSetMethodsLoggerExample.class.getName());

    public static void main(String[] args) {
        // Create a TreeSet and add elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Date");

        // Log the initial TreeSet
        logger.log(Level.INFO, "Initial TreeSet: {0}", treeSet);

        // Add all elements from another collection
        List<String> moreFruits = Arrays.asList("Fig", "Grape", "Elderberry");
        treeSet.addAll(moreFruits);
        logger.log(Level.INFO, "After adding more fruits: {0}", treeSet);

        // Demonstrate ceiling method
        String ceilingFruit = treeSet.ceiling("Cherry");
        logger.log(Level.INFO, "Ceiling of 'Cherry': {0}", ceilingFruit);

        // Demonstrate floor method
        String floorFruit = treeSet.floor("Date");
        logger.log(Level.INFO, "Floor of 'Date': {0}", floorFruit);

        // Demonstrate higher method
        String higherFruit = treeSet.higher("Cherry");
        logger.log(Level.INFO, "Higher than 'Cherry': {0}", higherFruit);

        // Demonstrate lower method
        String lowerFruit = treeSet.lower("Fig");
        logger.log(Level.INFO, "Lower than 'Fig': {0}", lowerFruit);

        // Demonstrate descending iterator
        logger.log(Level.INFO, "Descending Iterator:");
        Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            logger.log(Level.INFO, descendingIterator.next());
        }

        // Demonstrate subset methods
        SortedSet<String> subSet = treeSet.subSet("Apple", "Date");
        logger.log(Level.INFO, "Subset from 'Apple' to 'Date': {0}", subSet);

        // Demonstrate tailSet method
        SortedSet<String> tailSet = treeSet.tailSet("Cherry");
        logger.log(Level.INFO, "TailSet from 'Cherry': {0}", tailSet);

        // Demonstrate pollFirst and pollLast
        String first = treeSet.pollFirst();
        logger.log(Level.INFO, "Poll First: {0}", first);
        String last = treeSet.pollLast();
        logger.log(Level.INFO, "Poll Last: {0}", last);

        // Log the final state of the TreeSet
        logger.log(Level.INFO, "Final TreeSet: {0}", treeSet);
    }
}

