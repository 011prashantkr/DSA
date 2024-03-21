package PatternBased_NestedLoops;

public class fullPyramid {
    public static void main(String[]arg){
        //combination of half pyramid and reverse half pyramid
        /*

         *
         **
         ***
         ****
         *****   ======>  combination of half pyramid and reverse half pyramid
         *****
         ****
         ***
         **
         *

         */
        //for half pyramid
        for(int i=1;i<=5;i++){
            //col
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } System.out.println();

        }
        //for half reverse pyramid
        for(int i=1;i<=5;i++){
            //col
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
