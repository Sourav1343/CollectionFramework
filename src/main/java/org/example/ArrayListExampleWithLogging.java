package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListExampleWithLogging {

    // Initialize Logger
    private static final Logger logger = Logger.getLogger(ArrayListExampleWithLogging.class.getName());

    public static void main(String[] args) {

        // Creating an ArrayList
        List<String> arrayList = new ArrayList<>();
        logger.log(Level.INFO, "ArrayList created: {0}", arrayList);

        // boolean add(E e) - Appending an element
        arrayList.add("Apple");
        logger.log(Level.INFO, "Element 'Apple' added: {0}", arrayList);

        // void add(int index, E element) - Adding element at specific index
        arrayList.add(1, "Banana");
        logger.log(Level.INFO, "Element 'Banana' added at index 1: {0}", arrayList);

        // boolean addAll(Collection<? extends E> c) - Adding all elements from another list
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Mango");
        moreFruits.add("Pineapple");
        arrayList.addAll(moreFruits);
        logger.log(Level.INFO, "All elements from moreFruits added: {0}", arrayList);

        // boolean addAll(int index, Collection<? extends E> c) - Add all elements at a specific index
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Orange");
        newFruits.add("Grapes");
        arrayList.addAll(2, newFruits);
        logger.log(Level.INFO, "All elements from newFruits added at index 2: {0}", arrayList);

        // void clear() - Clearing the list
        arrayList.clear();
        logger.log(Level.INFO, "ArrayList cleared: {0}", arrayList);

        // Adding elements again for more method examples
        arrayList.add("Kiwi");
        arrayList.add("Strawberry");
        arrayList.add("Peach");

        // Object clone() - Creating a shallow copy of the ArrayList
        List<String> clonedList = (ArrayList<String>) ((ArrayList<String>) arrayList).clone();
        logger.log(Level.INFO, "Cloned list created: {0}", clonedList);

        // boolean contains(Object o) - Check if an element exists
        boolean containsKiwi = arrayList.contains("Kiwi");
        logger.log(Level.INFO, "ArrayList contains 'Kiwi': {0}", containsKiwi);

        // E get(int index) - Get an element at a specific index
        String elementAtIndex = arrayList.get(1);
        logger.log(Level.INFO, "Element at index 1: {0}", elementAtIndex);

        // int indexOf(Object o) - Find index of a specific element
        int indexOfPeach = arrayList.indexOf("Peach");
        logger.log(Level.INFO, "Index of 'Peach': {0}", indexOfPeach);

        // E set(int index, E element) - Replace an element at a specific position
        arrayList.set(1, "Blueberry");
        logger.log(Level.INFO, "Element at index 1 replaced with 'Blueberry': {0}", arrayList);

        // int size() - Get the size of the ArrayList
        int size = arrayList.size();
        logger.log(Level.INFO, "Size of ArrayList: {0}", size);

        // Object[] toArray() - Convert the ArrayList to an array
        Object[] array = arrayList.toArray();
        logger.log(Level.INFO, "ArrayList converted to array: {0}", (Object) array);

    }
}
