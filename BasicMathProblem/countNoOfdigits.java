package BasicMathProblem;

public class countNoOfdigits {

    int count(int n){
        int count=0;
        for(int i=0;n>0;i++){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=66666;
        countNoOfdigits obj=new countNoOfdigits();
        System.out.println(obj.count(n));
    }

}
