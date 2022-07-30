package inheritance;

class ParentA
{
    public void property()
    {
        System.out.println("car,cash,Bank balance");
    }
   protected void marriage()
    {
        System.out.println("geetanjali || Pushapanjali || chandramukhi");
    }

}

class Atharva extends ParentA{

    public void marriage()
    {
        System.out.println("katrina || kareena || Janhavi");
    }
}

class NumP
{
    public Number getNum()
    {
       return 0;
    }

}
class NumC extends NumP
{
    public Integer getNum()
    {
        return 0;
    }

}


public class MethodOverriding {

    public static void main(String[] args) {


        Atharva at=new Atharva();
        at.property();
        at.marriage();
    }
}
