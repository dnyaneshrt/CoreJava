package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesTest {
    public static void main(String[] args) {

        String test="bbbcccccccccdddddddfffaaaaaaabbfff";
        char[] chars=test.toCharArray();
        Arrays.sort(chars);

        Set<Character> set=new HashSet<Character>();
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
