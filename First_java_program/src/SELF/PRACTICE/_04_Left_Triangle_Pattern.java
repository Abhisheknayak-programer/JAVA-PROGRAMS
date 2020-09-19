package SELF.PRACTICE;

//                           *
//                          **
//                         ***
//                        ****
//                       *****
//                      ******

public class _04_Left_Triangle_Pattern {
    public static void main(String[] args) {

        int count = 6-1;
        for(int i=1;i<=6;i++){

            for (int k=1;k<=count;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            count--;
        }
    }
}
