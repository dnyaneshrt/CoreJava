package collection;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List list=new ArrayList();//holding child class object into parent class reference is called as "Upcasting";

      System.out.println("enter list elements");
      for(int i=0;i<10;i++)
      {
          list.add(new Scanner(System.in).nextInt());
      }
        System.out.println("total elements in my list are : "+list.size());
        Collections.sort(list);
        System.out.println("list after sorting :"+list);
        //1.to print our list
        System.out.println("before deleteing list as follows:\n\n"+list);
        boolean isdeleted= list.remove("200");
         System.out.println("object is available (true/false)??"+ list.contains("200"));
        if(isdeleted)
            System.out.println("selected item is deleted");
        else
            System.out.println("selected item is not deleted");

        System.out.println("after deleteing list as follows:\n\n"+list);
        System.out.println("total elements in my list after deleting : "+list.size());

    System.out.println("list elements using iterator method as follows:\n");
     Iterator it= list.iterator();
     while(it.hasNext())
     {
         System.out.println(it.next());
     }
     //iterrate list using for each loop.
        System.out.println("list elements using for each loop as follows:\n");
        for(Object item:list)
        {
            System.out.println(item);
        }
        //forEach() method to iterate list items

        System.out.println("list elements using forEach() method loop as follows:\n");
        list.forEach((item)->System.out.println("++++++++++++"+item+"+++++++++++++++"));

        list.clear();//list will be empty here
        if(list.isEmpty())
            System.out.println("list is empty");
        else
            System.out.println("list is not empty");

        System.out.println(list.size());
    }
}
