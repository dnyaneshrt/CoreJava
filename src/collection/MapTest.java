package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(104,"mohit");
        map.put(105,"akshay");
        map.put(106,"rahul");
        map.put(107,"rohit");
        map.put(101,"amit");
        map.put(102,"yohesh");
        map.put(103,"dilip");
        map.put(108,"namrata");

      System.out.println(map.get(108));

      Set<Map.Entry<Integer,String>> set=map.entrySet();
      for(Map.Entry<Integer, String> s:set)
      {
          System.out.println(s.getKey()+":"+s.getValue());
      }
      if(map.containsValue("amit"))
          System.out.println("yes he is student");

      if(map.containsValue("xyz"))
          System.out.println("yes he is student");
      else
          System.out.println("yes he is not student");
        map.remove(103);

System.out.println("Map after removing one value");
        Set<Map.Entry<Integer,String>> set2=map.entrySet();
        for(Map.Entry<Integer, String> s:set2)
        {
            System.out.println(s.getKey()+":"+s.getValue());
        }
}
}
