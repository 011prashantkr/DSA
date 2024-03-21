package PraticeQuestions.Loops;
//print all even numbers between 1 to 100 using for loop.
public class evenNumbers {
    public static void main(String[]args){

        int n=100;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(  +i+"  ");
            }else{
                System.out.println( +i);
            }
        }
    }
}
