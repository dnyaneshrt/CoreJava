package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
//        Set set=new HashSet();// insertion happens in any order
       TreeSet set=new TreeSet(); //all elements will be sorted.
        set.add(100);
        set.add(150);
        set.add(50);
        set.add(3457);
        set.add(4530);
        set.add(99);
        set.add(150);
        set.add(50);
        set.add(3457);

        System.out.println("Set elements are as follows:");

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
