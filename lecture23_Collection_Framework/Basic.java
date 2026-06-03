package lecture23_Collection_Framework;

import java.util.*;

public class Basic{
    public static void main(String[] args) {
        // List or Collection -> Interfaces

        // ArrayList -> concrete 

       
        //ArrayList<Integer> list = new ArrayList<>();
        // List<Integer> list = new ArrayList<>();
        // Collection<Integer> collection = new ArrayList<>();


/* 
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);



        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        System.out.println(list2);

        //addAll
        list.addAll(list2);
        System.out.println(list);

        // removeAll
        list.removeAll(list2);
        System.out.println(list);

        // size
        System.out.println("Size of List1: " + list.size());
        System.out.println("Size of List2: " + list2.size());

        // clear
        System.out.println("Printing list2: " + list2);
        list2.clear();
        System.out.println("Size of List2: " + list2.size());

*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
            
        }

        // Get or Set
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);

        // get()
        System.out.println("Get Element : "+list3.get(2));

        // set()
        System.out.println("Before set: " + list3);
        list3.set(1, 100);
        System.out.println("After set: " + list3);


        // toArray
        Object[] arr = list3.toArray();
        for(Object obj : arr){
            System.out.println("Array Element: " + obj);
        }

        // contains
        System.out.println(list3.contains(100));    // true
        




    }
}