package array.sumEvenPosition;

public class SumOfOddElements {
    public static void main(String[] args) {
        int i,sum=0;
        int a[]={1,2,3,4,5,6};
        for(i=0;i<a.length;i++){
            if(i%2==0){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
