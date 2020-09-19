package SELF.PRACTICE;

//        *****
//        ****
//        ***
//        **
//        *
//        *
//        **
//        ***
//        ****
//        *****

public class _05_Pattern_complicated_set_by_me {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

