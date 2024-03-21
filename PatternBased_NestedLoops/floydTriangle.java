package PatternBased_NestedLoops;

public class floydTriangle {
    public static void main(String[] arg){
//        1
//        2 3
//        4 5 6         ==> print this floyd triangle
//        7 8 9 10
//        11 12 13 14 15


        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
