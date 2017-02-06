package bubbleSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("No, of enteries to be sorted:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String str = null;
        try{
            str = br.readLine();
        }catch(IOException ex){

        }
        int n;
        n = Integer.parseInt(str);
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers");

        for(int c=0;c<n;c++)
            try{
                arr[c] = Integer.parseInt(br.readLine());
            }catch(IOException ex){

            }
        int swap;
        for(int c=0;c<(n-1);c++){
            for(int d = 0; d<n-c-1; d++){
                if(arr[d]>arr[d+1]){
                    swap=arr[d];
                    arr[d] = arr[d+1];
                    arr[d+1]=swap;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

}
