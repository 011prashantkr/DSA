package Arrays_PraticeQuestions;

import java.util.Scanner;

public class TriplateSum {

    static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    static int  triplateSum(int[] arr, int traget) {
        int count=0;
        for(int i =0;i<arr.length;i++){//for fixing 1 element
            for(int j=i+1;j<arr.length;j++){ //for fixing 2 elemwnt
                for(int k=i+2;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==traget){
                        count++;
                    }
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of element of an array");
        int size= sc.nextInt();

        int[]arr=new int[size];//array creation
        System.out.println("Enter the element of an array");
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Traget : ");
        int target=sc.nextInt();

        System.out.print("Original Array");
        printArray(arr);
        System.out.println("Total No of triplate "+triplateSum(arr,target) );

    }
}
