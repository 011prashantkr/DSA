package advancePattern;
public class butterflyPattern{
 public static void main(String[] args) {
     int n=5;
     //outer loop
     for(int i=1;i<=n;i++){
         //inner loop
         for(int j=1;j<=i;j++){
             System.out.print("*");
         }
         int space=2*n-1;
         for(int j=1;j<=space;j++){
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
             System.out.print("*");
         }
         System.out.println();
     }
 }
}

