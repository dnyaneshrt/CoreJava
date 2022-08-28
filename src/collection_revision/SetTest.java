package collection_revision;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet();//HashSet uses hashing
        Set<Integer> set=new TreeSet();
        set.add(50);
        set.add(540);
        set.add(150);
        set.add(550);
        set.add(350);
        set.add(550);
        set.add(350);
        set.add(550);
        set.add(350);

        System.out.println(set);//set cannot have duplicate values
        set.add(878);
        System.out.println(set);

        for(Integer i:set)
        {
            System.out.println(i);
        }
        System.out.println( set.size());



    }
}
