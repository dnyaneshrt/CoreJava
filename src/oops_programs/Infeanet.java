package oops_programs;

public class Infeanet {
    public static void main(String[] args) {
        //ClassName refname=new ClassName()
        Student atharva=new Student();  //1st object
        atharva.roll=10;
        atharva.name="Atharva";
        atharva.address="Pune";

        System.out.println("Student 1");
        System.out.println("Roll no:"+atharva.roll+" Name:"+atharva.name+" Adddress:"+atharva.address);

        Student namrata=new Student();  //2st object
        namrata.roll=11;
        namrata.name="Namrata";
        namrata.address="Mumbai";

        System.out.println("Student 2");
        System.out.println("Roll no:"+namrata.roll+" Name:"+namrata.name+" Adddress:"+namrata.address);

    }
}
