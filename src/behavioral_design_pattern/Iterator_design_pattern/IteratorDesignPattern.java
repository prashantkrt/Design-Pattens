package behavioral_design_pattern.Iterator_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
// This is how actual iterator works
public class IteratorDesignPattern {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10); //modCount = 1
        list.add(20); //modCount = 2
        list.add(30); //modCount = 3
        list.add(40); //modCount = 4
        list.add(50); //modCount = 5

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next(); // now if we do the modification, it will throw exception
            // checkForModification() modCount ! = expectedModCount, throw newConcurrentModificationException();
            // list.add(34); // modCount+1 which will throw exception
            // list.remove(2); //modCount will be changed and throw exception
        }

        List<Integer> lst = new CopyOnWriteArrayList<>();

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);

        // creates the snapshot deepCopy
        // now we can add or delete won't change the actual List
        Iterator<Integer> itr = lst.iterator();

        while (itr.hasNext()) {
            Integer next = itr.next();
            lst.add(100);
        }
        System.out.println(lst);

        List<Integer> l = new CopyOnWriteArrayList<>();
//        for concurrent modification
//        Set<Integer> set = new CopyOnWriteArraySet<>();
//        Map<Integer,Integer> map = new ConcurrentHashMap<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        // creates the snapshot deepCopy
        // now we can add or delete won't change the actual List
        ListIterator<Integer> i = lst.listIterator();
        // hasPrevious() , previous()
        while (i.hasNext()) {
            Integer next = i.next();
            if (!l.isEmpty())
                l.remove(l.size() - 1);
        }
        System.out.println(l);
        // when we use ArrayList that case we are using same List, which gives concurrent Modification
    }
}
