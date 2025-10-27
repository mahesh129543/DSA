package extraLeetcode;

import java.util.HashMap;

public class minsumoftwolist {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date"};

        // Create a HashMap to store String → Index
        HashMap<String, Integer> map = new HashMap<>();

        // Loop through the array and put each string with its index
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        // Print the HashMap
        System.out.println(map);

        // Example: get index of a specific word
        System.out.println("Index of 'banana' is: " + map.get("banana"));
    }
}
