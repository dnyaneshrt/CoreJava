package oops_programs;

abstract class Shape
{
    abstract void area();
}
class Circle extends Shape{
    @Override
    void area() {
     int r=5;
     double pi=3.14;
     System.out.println("area of triangle :"+(pi*r*r));
    }
}

class Square extends Shape
{
    @Override
    void area() {
        int sides=10;
        System.out.println("area of square :"+(sides*sides));
    }
}

public class AbstractionTest {

    public void findArea(Shape shape)
    {
        shape.area();
    }

    public static void main(String[] args) {
        AbstractionTest abstractionTest=new AbstractionTest();
        abstractionTest.findArea(new Circle());
        abstractionTest.findArea(new Square());
        abstractionTest.findArea(new Shape(){

            @Override
            void area() {
                int l=10;
                int h=5;
                System.out.println("area of triangle: "+(0.5*h*l));
            }
        });
        Shape shape=new Shape() {
            @Override
            void area() {
                System.out.println("one more shape");
            }
        };
        shape.area();


    }
}
//lamda expression