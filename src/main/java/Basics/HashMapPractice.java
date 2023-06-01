package Basics;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 12345);
        empIds.put("Carl", 83473);
        empIds.put("Kyle", 83297);
        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsKey("Kate"));

        System.out.println(empIds.containsValue(12345));
        System.out.println(empIds.containsValue(1));

        empIds.put("John", 98247);
//        if value already exist, it will just update with new number, if neither exist, it will add
//        as a new entry
        empIds.replace("John", 7777);
//        replace is a bit safer to do if you don't to add a new entry and just want to update

        empIds.putIfAbsent("John", 222);
        empIds.putIfAbsent("Steve", 13219);
//        way safer
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);

    }
}
