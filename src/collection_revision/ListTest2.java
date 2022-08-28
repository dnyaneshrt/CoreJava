package collection_revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();// upcasting.
//         names.add(10);  it will allow only String because of <String> it is called as generics
        list.add("java");
        list.add("c++");
        list.add("pyhton");
        list.add("android");
        list.add("kotlin");
        list.add("net");
        list.add("asp");
        list.add("c");

        System.out.println(list);

        //1st way to iterate your list by using normal for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.println("using normal for loop "+list.get(i));
        }

        //2nd way to iterate your list by using normal for each loop
        for(String string:list)
        {
            System.out.println("using for each loop "+string);
        }
        //3rd way to iterate your list by using Interator interface
        Iterator<String> it=list.iterator();
        while(it.hasNext())
        {
            System.out.println("using iterator "+it.next().toUpperCase());
        }
        //4th way to ierate your list using forEach() method
        list.forEach((t)-> System.out.println("using forEach loop "+t+"********"));
    }
}
