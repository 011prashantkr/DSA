package Arrays_PraticeQuestions;

public class checkWhetherNoIsPresentInArrayOrNot {
    public static  void main(String[]args){
        //checkWhetherNoIsPresentInArrayOrNot

        int[]number={1,2,3,5,6,7};//array

        //to find
        int x=1;
        boolean isInArray=false;
        for(int element:number){
            if(x==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("no is present");

        }else{
            System.out.println("not present");
        }

    }
}
