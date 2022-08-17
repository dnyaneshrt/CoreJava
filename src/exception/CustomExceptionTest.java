package exception;

import java.util.Scanner;

public class CustomExceptionTest {

    public void atm(int cash) throws CashNotAvailableException {
        if(cash>5000)
        {
            throw new CashNotAvailableException();
        }
        else {
            System.out.println("cash withdrwan successfully");
        }
    }

    public static void main(String[] args) throws CashNotAvailableException {
        CustomExceptionTest ct=new CustomExceptionTest();
        System.out.println("Enter cash please");
        int cash=new Scanner(System.in).nextInt();
        ct.atm(cash);

    }
}
