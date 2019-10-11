package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
        //printList(placesToVisit);
        //placesToVisit.add(1,"Alice Springs");
        //printList(placesToVisit);
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Darwin");
        System.out.println(placesToVisit.size());
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting "+i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator= linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity+" is already in list");
                return false;
            }else if(comparison > 0){
                // new city should appear before this one
                // brisbane -> adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                System.out.println("Adding: "+newCity);
                return true;
            }else if(comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        System.out.println("Adding: "+newCity);
        return true;
    }
}
