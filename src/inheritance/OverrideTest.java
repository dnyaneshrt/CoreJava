package inheritance;
class Iphone12
{
   public void camera()
    {
        System.out.println("iphone 12 is having 32 mp camera");
    }
    public void security()
    {
        System.out.println("iphone 12 is having Good security");
    }
}
class IPhone13 extends Iphone12{
   @Override
    public void camera()
    {
        System.out.println("iphone 13 is having 64 mp camera");
    }
}
public class OverrideTest {
    public void finalVarTest()
    {
       int num=100;
        num=200;
        System.out.print("num:"+num);
    }


    public static void main(String[] args) {
        IPhone13 i13=new IPhone13();
        i13.camera();
        i13.security();
        new OverrideTest().finalVarTest();;
    }
}
