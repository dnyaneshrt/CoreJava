package predicateFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullTest {
    public static void main(String[] args) {
        String[] names={"Amar",null,"ajay",null,"namrata","","sonali"};
        System.out.println("array length including null and empty strings "+names.length);
        //not null check should be first in and condition
        Predicate<String> p1=s->s!=null&&s.length()>0;//Predicate condition to check not null and non-empty.
        ArrayList<String> al=new ArrayList<>();
        for(String s:names)
        {
            if(p1.test(s))
            {
                al.add(s);
            }
        }
        System.out.println("after removing null and empty values array is as follows::");
        System.out.println(al);
        System.out.println("arrayList size after Predicate "+al.size());
    }
}
