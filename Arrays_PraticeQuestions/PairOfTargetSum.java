package Arrays_PraticeQuestions;

import java.util.Scanner;

public class PairOfTargetSum {

 static void printArray(int [] arr){
     for(int num:arr){
         System.out.print(num + " ");
     }
     System.out.println();
 }
   static int sumPair(int[] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){// for fixing first element
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target) {
                    count++;
                }
            }
        }
        return count;
    }

     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+" element in array : ");
         for(int i=0;i<arr.length;i++){
             arr[i]= sc.nextInt();
         }
         System.out.println("Enter the traget :");
         int traget=sc.nextInt();
//         int[] arr={4,6,5,8,2};
//         int traget=7;
         System.out.println("Orignal Array");
         printArray(arr);
         System.out.println("total Pair :"+sumPair(arr ,traget));
     }

}
