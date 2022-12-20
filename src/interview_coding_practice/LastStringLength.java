package interview_coding_practice;

public class LastStringLength {
    public static void main(String[] args) {
        String s="my name is dnyaneshwar";
        String last_string = "";
        int count_last=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                break;

            last_string=last_string+s.charAt(i);
            count_last++;
        }
        System.out.println("length of last String = "+count_last);

        System.out.println("last string after revsersing: "+last_string);
    }
}
