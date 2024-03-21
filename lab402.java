/*2. Aim of the program : Illustrate the execution of constructors in multi-level inheritance
with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user. Input: Enter the dimensions
Output: Display the dimensions accordingly */

import java.util.*;
class Plate
{
    public static int length,breadth;
    public Plate()
    {
        length=breadth=1;
    }
     public Plate(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
     public static void display()
     {
        System.out.println("Dimensions of plate are length: "+length+" breadth: "+breadth);
     }  
}
class Box extends Plate
{
    public static int height;
    public Box()
    {
        height=1;
    }
    public Box(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
    }
     public static void display()
     {
        System.out.println("Dimensions of box are length: "+length+" breadth: "+breadth+" height: "+height);
     }  
}
class Wood_box extends Box
{
    public static int thickness;
    public Wood_box()
    {
        thickness=1;
    }
    public Wood_box(int length,int breadth,int height,int thickness)
    {
        super(length,breadth,height);
        this.thickness=thickness;
    }
         public static void display()
     {
        System.out.println("Dimensions of wood box are length: "+length+" breadth: "+breadth+" height: "+height+" thickness: "+thickness);
     } 
    
}

public class lab402 {

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int l,b,h,t;
        System.out.println("Enter the dimensions:");
        System.out.println("Enter the length:");
        l=sc.nextInt();
        System.out.println("Enter the breadth:");
        b=sc.nextInt();
        System.out.println("Enter the height:");
        h=sc.nextInt();
        System.out.println("Enter the thickness:");
        t=sc.nextInt();
        //Plate P=new Plate(l,b);
        //Box B=new Box(l,b,h);
        Wood_box W=new Wood_box(l,b,h,t);
        Plate.display();
        Box.display();
        W.display();
        
        
        
    }
    
}