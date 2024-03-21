package BasicMathProblem;

public class Main {

    public static void main(String[] args) {
        int [] n={2,2,8,9,0,0};
        int sum1=0;
        int sum2=0;
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<=n.length-1;i++){
            if(n[i]%2==0){
                evenSum=sum1+n[i];
                sum1=evenSum;
            }else{
                oddSum=sum2+ n[i];
                sum2=oddSum;

            }

        }
        System.out.println(evenSum+" "+oddSum);
    }

}


