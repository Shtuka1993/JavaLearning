package methodAndConstructor.replacingRows;

public class SwappingRow {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rev d = new rev();
        d.log(a);
    }

}

class rev{


    int i,j,k,t;

    void log(int a[][]) {
        for (k = 0; k < 3; k++) {
            t = a[1][k];
            a[1][k] = a[2][k];
            a[2][k] = t;
        }
        for (i = 0; i < 3; i++) {
            for(j=0; j<3;j++){
                System.out.print(a[i][j] + " ");
             }
            System.out.println("");
        }
    }
}
