package methodAndConstructor.min_max_AndTheirSum;

/**
 * Created by 1 on 01.02.2017.
 */
public class MaxMinOfArray {

    static int sum(int a[]){
        int i,max=0, min=a[0],sum=0;
        for(i=0;i<5;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("max is:"+max);
        for(i=0;i<5;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("min is:"+min);
        sum = min+max;
        return sum;
    }

    public static void main(String[] args) {
        int ans;
        int a[]=new int[5];
        a[0]=8;
        a[1]=5;
        a[2]=3;
        a[3]=7;
        a[4]=9;
        ans=sum(a);
        System.out.println(ans);
    }

}
