package oops_programs;

//interfcae having only one abstract method: functional interface
//empty interfcae is called as marker interface.
//cloneable and serialable these are marker interface
interface Bank
{
   void provideLoanInfo();//abstract method
}
class Axis implements Bank
{
   @Override
   public void provideLoanInfo() {
    System.out.println("Axis bank provides loan @10.00 ROI");
   }
}

class SBI implements Bank
{
   @Override
   public void provideLoanInfo() {
      System.out.println("SBI bank provides loan @9.00 ROI");
   }
}

class PNB implements Bank
{

   @Override
   public void provideLoanInfo() {
      System.out.println("PNB bank provides loan @9.75 ROI");
   }
}

public class InterfaceDemo {
   public void applyForLoan(Bank bank)
   {
      bank.provideLoanInfo();
   }

   public static void main(String[] args) {
      InterfaceDemo amit= new InterfaceDemo();
      amit.applyForLoan(new Axis());

      InterfaceDemo yogesh= new InterfaceDemo();
      yogesh.applyForLoan(new SBI());

      InterfaceDemo dilip= new InterfaceDemo();
      dilip.applyForLoan(new PNB());

      InterfaceDemo namrata= new InterfaceDemo();
      namrata.applyForLoan(new Bank(){

         @Override
         public void provideLoanInfo() {
            System.out.println("fino bank provides loan @8.00 ROI");
         }
      });

// lamda expression new feature came in java 1.8 version
      InterfaceDemo salma= new InterfaceDemo();
      salma.applyForLoan(()->{
            System.out.println("Yes bank provides loan @12.00 ROI");
         });

   }
}
