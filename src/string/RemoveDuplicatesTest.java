package string;

import java.util.*;

public class RemoveDuplicatesTest {
    public static void main(String[] args) {

        String test="bbbcccccccccdddddddfffaaaaaaabbfff";
        char[] chars=test.toCharArray();
        Arrays.sort(chars);

        Set<Character> set=new TreeSet<>();
        String t="";
        for(int i=0;i<chars.length;i++)
        {
          set.add(chars[i]);
        }
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            t=t+it.next();
        }
        System.out.println(t);
    }
}
