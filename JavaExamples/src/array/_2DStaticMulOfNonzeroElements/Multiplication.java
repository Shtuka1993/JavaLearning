package array._2DStaticMulOfNonzeroElements;

public class Multiplication {
//Multiplication Of Non-Zero Elements
    public static void main(String[] args) {
        int i,j,mul=1,val=1;
        int a[][]={{0,0,0},{0,0,0},{1,80,90}};
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i][j]==0){
                    val=1;
                }else{
                    val=a[i][j];
                }
                mul*=val;
            }

        }
        System.out.println(mul);
    }
}
