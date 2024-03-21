/*
Write a program in Java having three classes Apple, Banana and Cherry. Class Banana
and Cherry are inherited from class Apple and each class have their own member function show() . Using
Dynamic Method Dispatch concept display all the show() method of each class.
*/

class Apple
{
    
  public void Display()
   {
     System.out.println("Inside Apple class");
   }
  
}
class Banana extends Apple
{
    public void Display()
   {
     System.out.println("Inside Banana class");
   }
}
class Cherry extends Apple
{
    public void Display()
   {
     System.out.println("Inside Cherry class");
   }
}
public class lab403 {

    
    public static void main(String[] args) {
                    Apple a1=new Cherry();
                    a1.Display();
                    Apple a2=new Banana();
                    a2.Display();
                    Apple a3=new Apple();
                    a3.Display();
                    
       
    }
    
}