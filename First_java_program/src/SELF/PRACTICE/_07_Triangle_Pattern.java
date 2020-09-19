package SELF.PRACTICE;

//          *
//         ***
//        *****

public class _07_Triangle_Pattern {
    public static void main(String[] args) {

        int count=2;

        for(int i=1;i<=5;i=i+2){
            for(int k=1;k<=count;k++){
                System.out.print(" ");
            }
            count--;
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

