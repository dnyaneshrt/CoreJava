package string;

public class ForEachTest {
    public static void main(String[] args) {
        int nums[]= {10,20,30,40,50,60};
        for(int n:nums)
        {
            System.out.println(n);
        }

        String[] names={"dilip","namrata","mohit","soham","salma","amit"};
        for(String name:names)
        {
            System.out.println(name.toLowerCase());
        }
    }
}
