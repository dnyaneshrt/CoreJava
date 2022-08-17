package exception;

public class CashNotAvailableException extends Exception{
    CashNotAvailableException()
    {
        super("cash not avaialble in ATM");//super is used to pass paramas to super classs constrctors
    }

}
