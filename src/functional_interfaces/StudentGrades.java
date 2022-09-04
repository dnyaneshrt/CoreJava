package functional_interfaces;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employees
 {
        private String name;
        private String designation;
        private int salary;

    public Employees(String name, String designation,int salary) {
        this.name = name;
        this.designation = designation;
        this.salary=salary;
    }

        @Override
        public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +'}';
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

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }
 }

class Student
{
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


}
public class StudentGrades {
    public static void main(String[] args) {
        Function<Student,String> f=(s)->{
            int marks=s.marks;
            if(marks>=80)
                return "A grade";
            else if(marks>=60)
                return "B grade";
            else if(marks>=35)
                return "C grade";
            else
                return "Fail";
        };


/*
        Function<Employees, Integer> f2= e->{
           return e.getSalary();
        };
*/
        Function<ArrayList<Employees>, Integer> f2= e->{
            int total=0;
            for(Employees emps:e)
            {
                total=total+ emps.getSalary();
            }
            return total;
        };

       Predicate<Employees> p=e->e.getSalary()<20000;// predicate to check whether employee is having sal>20000

       Function<Employees,Integer> f3=e->
       {
           int salary=0;
           salary=e.getSalary()+999;
           return salary;
       };

        ArrayList<Student> al=new ArrayList<>();
        pupulate(al);
        System.out.println(al);
        for(Student s:al)
        {
            System.out.println(s.name+"::"+s.marks+"::"+f.apply(s));
        }
        ArrayList<Employees> elist=new ArrayList<>();
        addEmployees(elist);
        System.out.println(elist);

        System.out.println("total sal: "+f2.apply(elist));
     /*   int total=0;
           for(Employees e:elist) {
               total=total+f2.apply(e);
           }
        System.out.println("total salary is :"+total);*/

        System.out.println(elist);
        for(Employees e:elist)
        {
            if(p.test(e))
            {
                System.out.println(f3.apply(e));
            }
        }
    }

    private static void addEmployees(ArrayList<Employees> elist) {
        elist.add(new Employees("mahesh","farmer",25000));
        elist.add(new Employees("dilip","dilvery boy",8000));
        elist.add(new Employees("amar","operator",12000));
        elist.add(new Employees("mahesh","Developer",55000));

    }

    private static void pupulate(ArrayList<Student> al) {
       Student mahesh= new Student("mahesh",100);
       Student amar= new Student("amar",80);
       Student dilip= new Student("dilip",32);
       Student dnyaneshwar= new Student("dnyaneshwar",71);
       al.add(mahesh);
       al.add(amar);
       al.add(dilip);
       al.add(dnyaneshwar);
    }
}
