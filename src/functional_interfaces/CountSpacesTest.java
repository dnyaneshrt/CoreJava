package functional_interfaces;

import java.util.function.Function;

public class CountSpacesTest {
    public static void main(String[] args) {
        String string="dnyane  shwar tatyarao sartape";
        /*System.out.println(string);
        Function<String,String> f=(s)->s.replaceAll(" ","");
        System.out.println(f.apply(string));*/

       /* First way
       Function<String,Integer> f=(s)->s.length()-s.replaceAll(" ","").length();
        System.out.println("total spaces are "+f.apply(string));*/

      //second way
        Function<String,Integer> f=(s)->{
            int  count=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    count++;
                }
            }
            return count;
        };
        System.out.println("total spaces are using for loop "+f.apply(string));
    }
}
