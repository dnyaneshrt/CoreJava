package collection_revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
//        Map<Integer,String> students=new HashMap<>();
        Map<Integer,String> students=new TreeMap<>();
        students.put(101,"amit");
        students.put(15,"yogesh");
        students.put(35,"namrata");
        students.put(65,"akash");
        students.put(35,"amol");
        students.put(65,"akash");

        System.out.println(students);
        students.putIfAbsent(35,"dilip");
        Set keysets=students.keySet();
        for(Object i:keysets)
        {
            System.out.println(i);
        }
        Set<Map.Entry<Integer,String>> set=students.entrySet();
        for(Map.Entry s:set)
        {
            System.out.println(s.getKey()+":"+s.getValue());
        }
        System.out.println(students.size());
//        students.clear();
        System.out.println(students.size());
         students.forEach((a,b)-> System.out.println(a+":"+b));

    }
}
