package Arrays_PraticeQuestions;

public class sum {

    int sumOfElement(int [] array){

        int sum=0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array={1,2,4,5,6,7};
        sum obj=new sum();
        System.out.print("sum of all element "+ obj.sumOfElement(array));
    }
}
