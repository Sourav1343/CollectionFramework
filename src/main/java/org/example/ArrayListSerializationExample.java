package org.example;

import java.io.*;
import java.util.ArrayList;


public class ArrayListSerializationExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("Pineapple");
        arrayList.add("Strawberry");
        arrayList.add("Blueberry");
        arrayList.add("Mango");
        arrayList.add("Watermelon");
        arrayList.add("Peach");
        arrayList.add("Cherry");

        // File to store the serialized data
        String filename = "arraylist.ser";

        // Serialize the ArrayList
        serializeArrayList(arrayList, filename);

        // Deserialize the ArrayList
        ArrayList<String> deserializedList = deserializeArrayList(filename);

        // Display deserialized ArrayList
        System.out.println("Deserialized ArrayList: " + deserializedList);
    }
    //Method to serialize ArrayList
   public static void serializeArrayList(ArrayList<String> list,String filename){
       try(FileOutputStream fileOutputStream = new FileOutputStream(filename);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

           //write the ArrayList object to the file
           objectOutputStream.writeObject(list);
           System.out.println("ArrayList has been serialize");
       }
       catch (IOException e){
           e.printStackTrace();
       }
   }
    // Method to deserialize ArrayList
    @SuppressWarnings("unchecked")
    public static ArrayList<String> deserializeArrayList(String filename) {
        ArrayList<String> list = null;

        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            // Read the ArrayList object from the file
            list = (ArrayList<String>) objectInputStream.readObject();
            System.out.println("ArrayList has been deserialized!");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;

}}
