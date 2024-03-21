class labQ{
    static int count = 0;

    public labQ() {
        count++;
    }
}
public class lab204 {
    public static void main(String[] args) {

        labQ newclass1 = new labQ();
        labQ newclass2 = new labQ();
        labQ newclass3 = new labQ();
        labQ newclass4 = new labQ();
        labQ newclass5 = new labQ();
        labQ newclass6 = new labQ();
	System.out.println("No of objects Created :" + labQ.count);
}
}