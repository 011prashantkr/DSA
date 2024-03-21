package PatternBased_NestedLoops;

public class zeroOneTriangle {
    public static void main(String []args){
//        1
//        0 1
//        1 0 1    ==>0-1 triangle
//        0 1 0 1
//        1 0 1 0 1
        int n=5;
        //outter loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


    }
}
