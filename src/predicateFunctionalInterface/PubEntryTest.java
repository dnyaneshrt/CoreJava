package predicateFunctionalInterface;


import java.util.ArrayList;
import java.util.function.Predicate;

class SoftwareEngineer
{
    private String name;
    private String designation;
    private boolean isHavingGf;
    private int age;
    private String address;

    public SoftwareEngineer(String name, String designation, boolean isHavingGf, int age, String address) {
        this.name = name;
        this.designation = designation;
        this.isHavingGf = isHavingGf;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", isHavingGf=" + isHavingGf +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isHavingGf() {
        return isHavingGf;
    }

    public void setHavingGf(boolean havingGf) {
        isHavingGf = havingGf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class PubEntryTest {
    public static void main(String[] args) {
        Predicate<SoftwareEngineer> p1=emp->emp.getAge()>18&&emp.isHavingGf()==true;
        Predicate<SoftwareEngineer> p2=emp->emp.getAddress().equals("hyderabad");


        ArrayList<SoftwareEngineer> list=new ArrayList<>();

        pupulate(list);
        System.out.println("list after populate"+list);

        System.out.println("employees who's age>18 and having GF");
        display(p1,list);

        System.out.println("employees who's age>18 and having GF or address is hyderabad");
        display(p1.or(p2),list);//Predicate Joining by using or Operator.  workd exactly same as logical OR.

        System.out.println("list of employees who are not from hyderabad");
        display(p2.negate(),list);

    }

    private static void pupulate(ArrayList<SoftwareEngineer> list) {
        SoftwareEngineer mahesh=new SoftwareEngineer("mahesh","manager",true,25,"Banglore");
        SoftwareEngineer yogesh=new SoftwareEngineer("yogesh","Developer",true,25,"maharashtra");
        SoftwareEngineer amar=new SoftwareEngineer("amar","manager",true,17,"maharashtra");
        SoftwareEngineer dilip=new SoftwareEngineer("dilip","manager",false,25,"Chennai");
        SoftwareEngineer dnyanu=new SoftwareEngineer("dnyanu","Developer",false,27,"hyderabad");

        list.add(mahesh);
        list.add(yogesh);
        list.add(amar);
        list.add(dilip);
        list.add(dnyanu);
    }

    private static void display(Predicate<SoftwareEngineer> p1, ArrayList<SoftwareEngineer> list) {

        for(SoftwareEngineer l:list)
        {
            if(p1.test(l))
            {
                System.out.println(l.getName());
            }
        }
    }

}
