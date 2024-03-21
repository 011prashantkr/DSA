package Arrays_PraticeQuestions;

import java.util.Scanner;

public class WhetherNoIsPresentInArrayOrNot {
       boolean isPresent(int []array,int target){
           for(int num:array){
               if(num==target){
                   return true;
               }
           }
           return false;
       }

       static void printArray(int array[]){
           for(int num:array){
               System.out.print(num+" ,");
           }
           System.out.println();
       }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] array=new int[6];
        System.out.println("enter the element ");
        for(int i=0;i<6;i++){
            array[i]=sc.nextInt();
        }
        printArray(array);
        System.out.println("enter the number you want to check :");
        int target=sc.nextInt();
        WhetherNoIsPresentInArrayOrNot obj=new WhetherNoIsPresentInArrayOrNot();
        System.out.println( obj.isPresent(array,target));
    }
}
