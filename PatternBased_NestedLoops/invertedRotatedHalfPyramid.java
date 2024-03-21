package PatternBased_NestedLoops;

public class invertedRotatedHalfPyramid {
    public static void main(String[]args){ // main function
        //print
     /*       *
            * *
          * * *       ==> inverted and rotated half pyramid
        * * * *

      */

        int n=4;
        //row
        for(int i=1;i<=n;i++){
            // innner loop ==> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loo 2 ==>star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
