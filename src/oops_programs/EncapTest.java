package oops_programs;


class Employee
{
private int eid;
private int age;
private String ename;
private String eaddress;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<1)
        {
            System.out.println("age cannot be negative");
        }
        this.age = age;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

//getter and setter methods
    //beans classees
    //pojos

}

public class EncapTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
    /*    e1.eid=1000;
        e1.age=-25;
        e1.ename="yogesh";
        e1.eaddress="Pune";

        System.out.println("eid: " +e1.eid);
        System.out.println("age: " +e1.age);
        System.out.println("name: " +e1.ename);
        System.out.println("address: " +e1.eaddress);*/
        e1.setAge(25);
        System.out.println(e1.getAge());

        e1.setEname("atharva");
        System.out.println(e1.getEname());

    }
}
