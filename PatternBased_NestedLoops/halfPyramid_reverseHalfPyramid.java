package PatternBased_NestedLoops;

public class halfPyramid_reverseHalfPyramid {
    /* print this pattern

    *                    * * * *
    * *          or      * * *     ==>reverse half pyramid
    * * *                * *
     * * * *             *

     */

    public static void main(String[]args){
        int rows=4;
        int column=4;


        //row ke liye
//        for(int row=1;row<=4;row++){
//            //column ke liye
//            for(int col=1;col<=row;col++){
//                System.out.print("*");
//            }
//            System.out.println();
    //}

        //rows
        for(int i=1;i<=4;i++){
            //column
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
