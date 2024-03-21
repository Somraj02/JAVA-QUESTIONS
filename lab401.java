/*1. Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D
sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per
cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by
the user where 3D inherits from 2D. Input: Enter dimensions
Output: Display the cost of plastic */
import java.util.*;
class plasticSheet
{
public int length;
public int breadth;
public plasticSheet()
{
length=breadth=1;
}
public plasticSheet(int length,int breadth)
{
this.length=length;
this.breadth=breadth;
}
public int area()
{
return length*breadth;
}
}
class box extends plasticSheet
{
public int height;
public box(int length,int breadth,int height)
{
super(length,breadth);
this.height=height;
}
public int volume()
{
return area()*height;
}
}
public class lab401 {  
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int choice;
System.out.println("Enter what you want to make");
System.out.println("0 for sheet 1 for 3D box");
choice=s.nextInt();
switch(choice)
{
case 0: 
System.out.println("Enter dimensions of sheet");
plasticSheet p1=new plasticSheet(s.nextInt(),s.nextInt());
System.out.println("Cost required for making plastic sheet is "+(40*p1.area()));
break;
case 1:
System.out.println("Enter dimensions of box");
box b=new box(s.nextInt(),s.nextInt(),s.nextInt());
System.out.println("Cost required for making plastic sheet is "+(60*b.volume()));
break;
}
}    
}