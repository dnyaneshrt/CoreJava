package basic_programs;

public class SwitchTest {
    public static void main(String[] args) {
        String weekday="funday";

        switch(weekday)
        {
            case "sunday": System.out.println("its holiday enjoy..");break;
            case "monday": System.out.println("its monday enjoy..");break;
            case "tuesday": System.out.println("its tuesday enjoy..");break;
            case "wednesday": System.out.println("its wednesday enjoy..");break;
            case "thursday": System.out.println("its thursdsay enjoy..");break;
            case "friday": System.out.println("its friday enjoy..");break;
            case "saturady": System.out.println("its saturady enjoy..");break;

            default:
                System.out.println("hey you are not from this world");

        }
    }

}
