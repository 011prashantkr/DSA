package Arrays_PraticeQuestions;
import java.sql.SQLOutput;
import java.util.*;
//take an array of names as input from the user and print them in the screen
public class Homework1 {
    public static void main(String[]args){
        //input of size of array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int size=sc.nextInt();

        //array
        String[] name=new String[size];

        //User Input
        for(int i=0;i<size;i++){
            // for input of every index
            name[i]=sc.nextLine();
            System.out.println("Enter the name");


        }
         //for out put
        for(int i=0;i<name.length;i++){
            System.out.println("Entered Name Are:" +name[i]);

        }


    }
}
