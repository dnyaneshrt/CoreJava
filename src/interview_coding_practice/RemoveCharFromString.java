package interview_coding_practice;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String s="dnyaneshwar";
        String new_s="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a')
                new_s=new_s+s.charAt(i);

        }
        System.out.println("our String after removing entered character: "+new_s);
    }
}
