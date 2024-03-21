package Arrays_PraticeQuestions;

public class averageInArray {
    public static void main(String[]args){
        float sum=0;
        float average = 0;
        float[]physicsMarks={100.0f,100.0f,100f,100f,100f};
        float l= physicsMarks.length;

        for(float element:physicsMarks){
           sum=(sum+element);
           average=sum/l;
        }
        System.out.println(average);

    }
}
