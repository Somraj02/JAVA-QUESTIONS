import java.util.Scanner;
class rectangle{
    private int length;
    private int width;
    public void rectangle(int l, int w){
        length = l;
        width = w;

    }
    public void area(){
        System.out.println("The Area of the rectangle is :"+length*width);
    }
    public void perimeter(){
        System.out.println("The Perimeter of the rectangle is :"+ 2*(length+width));
    }
        
}
public class lab302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the reectangle :");
        int l = sc.nextInt();
        int w = sc.nextInt();
        rectangle b = new rectangle();
        b.rectangle(l,w);
        b.area();
        b.perimeter();

    }

}