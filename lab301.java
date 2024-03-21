import java.util.Scanner;
class box{
    private int length;
    private int width;
    private int height;
    public void box(int l, int w, int h){
        length = l;
        width = w;
        height = h;

    }
    public void volume(){
        System.out.println("The volume of the box is :"+length*width*height);
    }
        
}
public class lab301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length, width and height of the box :");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        box b = new box();
        b.box(l,w,h);
        b.volume();

    }

}