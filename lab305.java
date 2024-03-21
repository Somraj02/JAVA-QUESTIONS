import java.util.*;
class shapes{
    public void area(double r){
        double pi=3.14;
        System.out.println("the area of the circle is "+ pi*r*r );
    }
    public void area(float b,float h){
        System.out.println("the area of the triangle is "+ 0.5*b*h );
    }
    public void area(float side){
        System.out.println("the area of the square is "+ side*side );
    }
}

public class lab305 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shapes s1=new shapes();
        System.out.println("enter the radius of the circle");
        double radius=sc.nextDouble();
        s1.area(radius);
        System.out.println("enter the of the breadth and height of the triangle");
        float breadth =sc.nextFloat();
        float height =sc.nextFloat();
        s1.area(breadth,height);
        System.out.println("enter the side of the square " );
        float side=sc.nextFloat();
        s1.area(side);
    }

}
