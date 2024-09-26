package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
    Set<String> conjuntohash = new HashSet<>();
    conjuntohash.add("ELEMENT KPRBC");
    conjuntohash.add("ELEMENT YPBTM");
    conjuntohash.add("ELEMENT AADXU");
    conjuntohash.add("ELEMENT RXCGJ");
    conjuntohash.add("ELEMENT WYMVD");
    conjuntohash.add("ELEMENT WFGEJ");
    conjuntohash.add("ELEMENT TYGBS");
    conjuntohash.add("ELEMENT MAPTK");
    conjuntohash.add("ELEMENT GJXVE");
    conjuntohash.add("ELEMENT BAFGL");
        return conjuntohash;
    }

    public static Set<String> createTreeSet() {
        Set<String> conjuntoTree= new TreeSet<>();
        conjuntoTree.add("ELEMENT KPRBC");
        conjuntoTree.add("ELEMENT YPBTM");
        conjuntoTree.add("ELEMENT AADXU");
        conjuntoTree.add("ELEMENT RXCGJ");
        conjuntoTree.add("ELEMENT WYMVD");
        conjuntoTree.add("ELEMENT WFGEJ");
        conjuntoTree.add("ELEMENT TYGBS");
        conjuntoTree.add("ELEMENT MAPTK");
        conjuntoTree.add("ELEMENT GJXVE");
        conjuntoTree.add("ELEMENT BAFGL");
        return conjuntoTree;
    }

    private static void printSet(Set<String> customSet) {
        for(String Elemento: customSet){
            System.out.println(Elemento);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {

        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();
        createHashSet();

        String complemento = "ELEMENT AAA";
        boolean Resultado = addElementToSet(hashSet, complemento);
        boolean treeSetResult = addElementToSet(treeSet, complemento);

        printSet(hashSet);
        System.out.println("---------------------");
        System.out.println("---------------------");
        printSet(treeSet);
    }

}
