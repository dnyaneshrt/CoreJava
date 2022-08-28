package collection_revision;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> list=new LinkedList<>();// upcasting.
//         names.add(10);  it will allow only String because of <String> it is called as generics
            list.add("java");
            list.add("c++");
            list.add("python");
            list.add("android");
        System.out.println(list);

        Collections.sort(list);//utilty method
        System.out.println("get list elements using get() method "+list.get(3));

            list.add(2,"kotlin");
            list.add(4,"angular");

        System.out.println(list);
        List<String> names=new ArrayList<String>();
        names.add("amit");
        names.add("yogesh");
        names.add("namrata");
        System.out.println(names);


        names.remove("amit");
        System.out.println(names);
        list.addAll(names);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains("yogesh"));
        System.out.println(list.contains("flutter"));

//        list.set(2,"python");// replace value based on index number

        list.remove(1);
        System.out.println(list);

        list.clear();
        System.out.println(list.size());
        System.out.println(list);

    }
}
