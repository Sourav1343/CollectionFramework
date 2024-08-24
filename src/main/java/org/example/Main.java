package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

        // Logger instance
        private static final Logger logger = Logger.getLogger(Main.class.getName());

        public static void main(String[] args) {
            List<String> list1 = new ArrayList<>();
            list1.add("Apple");
            list1.add("Banana");
            list1.add("Grapes");
            list1.add("Pineapple");
            list1.add("Strawberry");
            list1.add("Blueberry");
            list1.add("Mango");
            list1.add("Watermelon");
            list1.add("Peach");
            list1.add("Cherry");

            List<String> list2 = new ArrayList<>();
            list2.add("Orange");
            list2.add("Kiwi");
            list2.add("Papaya");
            list2.add("Dragonfruit");
            list2.add("Pear");
            list2.add("Pomegranate");
            list2.add("Lemon");
            list2.add("Lime");
            list2.add("Coconut");
            list2.add("Avocado");

            logger.log(Level.INFO, "List1 before merging: {0}", list1);
            logger.log(Level.INFO, "List2 before merging: {0}", list2);

            list1.addAll(list2);

            logger.log(Level.INFO, "{0}", list1);
            logger.log(Level.INFO, "List1 (non-null check): {0}", Objects.requireNonNull(list1));
            System.out.println(list1.size());

            Iterator<String> itr= list1.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            Collections.sort(list1);
            System.out.println(list1);


           /* logger.log(Level.INFO, "ListIterator Interface farowrd");
            ListIterator<String> listIterator = list1.listIterator();
            while (listIterator.hasNext())
            {
                System.out.println(listIterator.next());
            }*/

            logger.log(Level.INFO, "ListIterator Interface Backward");
            ListIterator<String> listIterator2 = list1.listIterator(list1.size());
            while (listIterator2.hasPrevious())
            {
                System.out.println(listIterator2.previous());
            }
            list1.forEach(System.out::println);
            list2.forEach(System.out::println);
        }
   /* Iterator: Use when you need to safely remove elements during iteration.

    For-Each Loop: Simplest and most readable form for read-only access.

    ListIterator: Allows both forward and backward traversal, and modification of elements during iteration.

    For Loop: Ideal when working with index-based collections like List.

    forEach(): Use for functional-style programming (introduced in Java 8).

    forEachRemaining(): Efficient when processing all remaining elements starting from a certain position.*/
    class Student {
       int rollno;
       String name;
       int age;

       Student(int rollno, String name, int age) {
           this.name = name;
           this.rollno = rollno;
           this.age = age;
       }


       Student s1 = new Student(101, "Sonoo", 23);
       Student s2 = new Student(102, "Ravi", 21);
       Student s3 = new Student(103, "Hanumat", 25);
      List<Student> students = new ArrayList<Student>();

   }

}

