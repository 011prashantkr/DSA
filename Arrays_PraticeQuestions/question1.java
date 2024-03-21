package Arrays_PraticeQuestions;

public class question1 {
    public static void main(String[]args){
        //create an array of 5 floats and calculate their sum
        float sum =0;
        float[] number={1.0f,2.0f,3.0f,3.0f,5.0f};

        for(float element:number){
            sum=+sum+element;//
        }
        System.out.println(sum);
    }
}
