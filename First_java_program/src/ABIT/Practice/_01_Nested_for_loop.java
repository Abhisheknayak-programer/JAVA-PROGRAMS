package ABIT.Practice;

public class _01_Nested_for_loop {
    public static  void main(String[] args){

        for(int j=0;j<3;j++) {
            System.out.print("Pass " + j + ":");
            for (int i = 0; i <= 100; i++) {
                if (i == 10) break;
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Loop Complete.");
    }
}
