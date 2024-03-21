public static class Check{

    boolean isAscendingOrder(int []arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]){
                return true;
            }
        }
        return false;
    }
    boolean isDescendingOrder(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return true;
            }
        }
        return false;
    }
}

public static void main(String[] args) {
    int[]arr={9,8,7,5,4,3,2,2};

    Check obj=new Check();


    System.out.println(obj.isAscendingOrder(arr));
    System.out.println(obj.isDescendingOrder(arr));
}
