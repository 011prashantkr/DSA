package Arrays_PraticeQuestions.TwoDArrays;
import java.util.Scanner;
public class twoDArray {

    // to take input from the user and print it (2d Array)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        System.out.println("enter the no of cols");
        int cols=sc.nextInt();

        int[][]numbers=new int[rows][cols];

        //input by using for loop where outer loop controls row and inner loop control cols
        System.out.println("enter the elements of 2D array");
        for(int i=0;i<rows;i++){ //outer loop
            for(int j=0;j<cols;j++){//inner loop
                numbers[i][j]=sc.nextInt();
            }
        }

        //to find this no which also taken by user
        System.out.println("Enter the no you want to find in the 2D array");
        int x=sc.nextInt();

        //to print the index of no x

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at the location "+i +","+j);
                }
            }
        }
    }
}
