package pro.sky.skyprodemospring;

import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1,1,2,3,4,4,5,5,6,7));
        List<String> strings = new ArrayList<>(List.of("one","two","two","три","три","три"));
        task1(integerList);
        task2(integerList);
        task3(strings);
        task4(strings);
    }
    public static void task1(List<Integer> integerList) {
        for (Integer i: integerList) {
            if(i % 2 !=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void task2(List<Integer> integerList) {
        Set<Integer> integerSet = new TreeSet<>(integerList);
        for (Integer i: integerSet) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
        System.out.println();
    }
    public static void task3(List<String> strings) {
        System.out.println(new TreeSet<>(strings));
    }
    public static void task4(List<String> strings) {
        Map<String, Integer> countByWord = new HashMap<>();
        for (String str : strings) {
            if (countByWord.containsKey(str)) {
                countByWord.put(str,countByWord.get(str) + 1);
            } else {
                countByWord.put(str,1);
            }
        }
        for (Map.Entry<String, Integer> entry: countByWord.entrySet()) {
            if (entry.getValue()>0) {
                System.out.println(entry);
            }
        }
    }
}
