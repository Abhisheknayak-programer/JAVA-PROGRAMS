package testing.accessmodifers;
import calc.*;


class Calculate extends Q4part{
    public void show(){
        // System.out.println(a);
        System.out.println(y);
    }
}       

public class Q4 {
    public static void main(String[] args){
        Calculate c1 = new Calculate();
        c1.show();
    }
}
