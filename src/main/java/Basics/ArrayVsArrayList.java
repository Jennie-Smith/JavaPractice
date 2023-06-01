package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = new String[4];
//        arrays - size never changes once created
        String[] friendsArray2 = {"Joey", "Jane", "Ariel", "Luke"};

        ArrayList<String> friendsArrayList = new ArrayList<>();
//        arraylist - grows and shrinks automatically
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("Mei", "Kate", "Joe"));
        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));

        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());

        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList);
        friendsArrayList2.add("Matt");
        System.out.println(friendsArrayList2);

        friendsArray2[0] = "Carl";
        System.out.println(friendsArray2[0]);

        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));

        friendsArrayList2.remove("Carl");
        System.out.println(friendsArrayList2);

//        to print out an array (not an arraylist) then you need a for loop
        for (int i = 0; i < friendsArray2.length; i++) {
            System.out.println(friendsArray2[i]);
        }
    }
}
