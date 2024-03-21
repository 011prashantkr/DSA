package Arrays_PraticeQuestions;

public class arrayBasic{
    public static void main(String[]args){

        //array
        int[]marks=new int[3];
        marks[0]=88;
        marks[1]=98;
        marks[2]=78;

        //find the length of array

        System.out.println(marks.length);

        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
    }
}
