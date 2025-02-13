package nine.collection.demo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Idu List<E> elementi");
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Richard");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Sam");
        names.add("John");
        printCollection(names);

        System.out.println(names instanceof Set<?>);
        System.out.println(names instanceof ArrayList<String>);

        System.out.println("Idu set<E> elementi");

        HashSet<String> setOfNames = new HashSet<>();
        setOfNames.add("John");
        setOfNames.add("Jane");
        setOfNames.add("Bob");
        setOfNames.add("Mary");
        setOfNames.add("Richard");
        setOfNames.add("Jack");
        String name1 =  "Jack";
        setOfNames.add(name1);
        String name2 = "Jack";
        setOfNames.add(name2);
        setOfNames.add("Jack");
        setOfNames.add("Sam");
        setOfNames.add("John");
        printCollection(setOfNames);
    }

    static void printCollection(Collection<String> elements){
        for(String element : elements) {
            System.out.println(element);
        }
    }

    static void printList(List<String> elements){
        for (int i = 0; i < elements.size(); i++){
            String element = elements.get(i);
            System.out.println(element);
        }
    }

    static void printSet(Set<String> elements){
        for (String element : elements){
            System.out.println(element);
        }
    }
}
