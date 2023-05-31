package LeetCodeHackerRank;

import java.util.*;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
//        sets by design do not add duplicates

        names.remove("Walter");
//        can't remove by index

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Mike"));

//        different ways to loop through set
        for (String name: names){
            System.out.println(name);
        }
        names.forEach(System.out::println);
        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
//        sets will never take in duplicates
//        or (will do the same thing as the addAll method)
        Set<Integer> numberSet2 = new HashSet<>(numberList);

        System.out.println(numberSet);

//        will clear out the entire set
        names.clear();
        System.out.println(names.isEmpty());
    }
}
