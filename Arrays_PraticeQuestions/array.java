package Arrays_PraticeQuestions;

import java.util.Scanner;

public class array {

    static void printArray(int [] arr){
        for(int num:arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static int searchInArray(int [] array,int traget){
        //linear search
        for(int i=0;i<array.length;i++){
            if(array[i]==traget){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of element ");
        int size=sc.nextInt();
        int []array=new int[size];
        System.out.println("Enter the  "+ size +" elements in the array ");
        for(int i =0;i<array.length;i++){
             array[i] =sc.nextInt();
        }
        System.out.println("enter the no you want to find ");
        int traget=sc.nextInt();

        System.out.println("Original array");
        printArray(array);

        System.out.println(searchInArray(array,traget));
    }
}
