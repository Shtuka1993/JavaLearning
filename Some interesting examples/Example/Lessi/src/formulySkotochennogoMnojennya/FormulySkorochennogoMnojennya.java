/*
Тут є досить дурна маячня, не виходить нормально реалізуватичерез
массиви передачу данних. В принципі, треба підчстити код. Поміняти
параметри виходу. І якщо не лінь переробити код під колекції. MAP!!!...
*/

package formulySkotochennogoMnojennya;

//import java.awt.*;
//import javax.swing.*;

public class FormulySkorochennogoMnojennya/* extends JFrame*/{

    public static void main(String[] args){
        Mnogochleny m= new Mnogochleny();
        for(int i=0; i<8;i++){
            for(int j=0; j<m.ak.length*m.bk.length;j++){
                System.out.println(m.testList[i][0][j]+"="+m.testList[i][1][j]);
            }
        }
    }

}

class Mnogochleny{

    int[] ak = {1,2,3,4,5};
    int[] bk = {1,2,3,4,5};

    String[][] testList;
    String[][] key = null;

    /*
    public Mnogochleny(){
        testList = new String[8][ak.length*bk.length];
        key = new String[8][ak.length*bk.length];
        testList[0] = getAllSquarePolinomes_plus(ak,bk);
        testList[1] = getAllSquaresOfPolinomes_plus(ak,bk);
        testList[2] = getAllCubePolinomes_plus(ak,bk);
        testList[3] = getAllCubesOfPolinomes_plus(ak,bk);
        testList[4] = getAllSquarePolinomes_min(ak,bk);
        testList[5] = getAllSquaresOfPolinomes_min(ak,bk);
        testList[6] = getAllCubePolinomes_min(ak,bk);
        testList[7] = getAllCubesOfPolinomes_min(ak,bk);
    }
    */

    public Mnogochleny(){
        testList = new String[8][ak.length*bk.length];
        //key = new String[8][ak.length*bk.length];
        /*
        testList[0] = getAllSquarePolinomes_plus_KeyValue_withoutMap(ak,bk);
        testList[1] = getAllSquaresOfPolinomes_plus_KeyValue_withoutMap(ak,bk);
        testList[2] = getAllCubePolinomes_plus_KeyValue_withoutMap(ak,bk);
        testList[3] = getAllCubesOfPolinomes_plus_KeyValue_withoutMap(ak,bk);
        testList[4] = getAllSquarePolinomes_min_KeyValue_withoutMap(ak,bk);
        testList[5] = getAllSquaresOfPolinomes_min_KeyValue_withoutMap(ak,bk);
        testList[6] = getAllCubePolinomes_min_KeyValue_withoutMap(ak,bk);
        testList[7] = getAllCubesOfPolinomes_min_KeyValue_withoutMap(ak,bk);
        */
    }

    /*
    public Mnogochleny(int[] a, int[] b){
        ak = a;
        bk = b;
        testList = new String[8][ak.length*bk.length];
        testList[0] = getAllSquarePolinomes_plus(ak,bk);
        testList[1] = getAllSquaresOfPolinomes_plus(ak,bk);
        testList[2] = getAllCubePolinomes_plus(ak,bk);
        testList[3] = getAllCubesOfPolinomes_plus(ak,bk);
        testList[4] = getAllSquarePolinomes_min(ak,bk);
        testList[5] = getAllSquaresOfPolinomes_min(ak,bk);
        testList[6] = getAllCubePolinomes_min(ak,bk);
        testList[7] = getAllCubesOfPolinomes_min(ak,bk);
    }
    */
/*
    //a^2-b^2
    private String dividionOfSquares(int a, int b){
        return "("+a+"*a-"+b+"*b)*("+a+"*a+"+b+"*b)";
    }

    //a^2+b^2
    private String sumOfSquares(int a, int b){
        return "("+a+"*a+"+b+"*b)^2-"+2*a*b+"*a*b";
    }

    //(a+b)^2
    private String squareOfSum(int a, int b){
        return "("+a*a+"*a^2+"+2*a*b+"*a*b+"+b*b+"*b^2)";
    }

    //(a-b)^2
    private String squareOfDividion(int a, int b){
        return "("+a*a+"*a^2-"+2*a*b+"*a*b+"+b*b+"*b^2)";
    }

    //a^3-b^3
    private String dividionOfCubes(int a, int b){
        return "("+a+"*a-"+b+"*b)*("+a*a+"*a^2+"+a*b+"*a*b+"+b*b+"*b^2)";
    }

    //a^3+b^3
    private String sumOfCubes(int a, int b){
        return "("+a+"*a+"+b+"*b)*("+a*a+"*a^2-"+a*b+"*a*b+"+b*b+"*b^2)";
    }

    //(a+b)^3
    private String cubeOfSum(int a, int b){
        return "("+a*a*a+"*a^3+"+3*a*a*b+"*b*a^2+"+3*a*b*b+"*a*b^2+"+b*b*b+"*b^3)";
    }

    //(a-b)^3
    private String cubeOfDividion(int a, int b){
        return "("+a*a*a+"*a^3-"+3*a*a*b+"*b*a^2+"+3*a*b*b+"*a*b^2-"+b*b*b+"*b^3)";
    }

    //Return all Polinomes resalt
    private String[] getAllSquarePolinomes_min(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = dividionOfSquares(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllSquaresOfPolinomes_min(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = squareOfDividion(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllCubePolinomes_min(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = dividionOfCubes(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllCubesOfPolinomes_min(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = cubeOfDividion(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllSquarePolinomes_plus(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = sumOfSquares(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllSquaresOfPolinomes_plus(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = squareOfSum(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllCubePolinomes_plus(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = sumOfCubes(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[] getAllCubesOfPolinomes_plus(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[] result = new String[n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i*m+j] = cubeOfSum(ak[i],bk[j]);
            }
        }
        return result;
    }

    //Return Array Key Value

    private String[][] getAllSquarePolinomes_min_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = ""+ak[i]*ak[i]+"a^2-"+bk[j]*bk[j]+"b^2";
                result[1][i*m+j] = dividionOfSquares(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllSquaresOfPolinomes_min_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = "("+ak[i]+"a-"+bk[j]+"b)^2";
                result[1][i*m+j] = squareOfDividion(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllCubePolinomes_min_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[1][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = ""+ak[i]*ak[i]*ak[i]+"a^3-"+bk[j]*bk[j]*bk[j]+"b^3";
                result[1][i*m+j] = dividionOfCubes(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllCubesOfPolinomes_min_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = "("+ak[i]+"a-"+bk[j]+"b)^3";
                result[1][i*m+j] = cubeOfDividion(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllSquarePolinomes_plus_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = ""+ak[i]*ak[i]+"a^2+"+bk[j]*bk[j]+"b^2";
                result[1][i*m+j] = sumOfSquares(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllSquaresOfPolinomes_plus_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = "("+ak[i]+"a^2-"+bk[j]+"b)^2";
                result[1][i*m+j] = squareOfSum(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllCubePolinomes_plus_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = ""+ak[i]*ak[i]*ak[i]+"a^3+"+bk[j]*bk[j]*bk[j]+"b^3";
                result[1][i*m+j] = sumOfCubes(ak[i],bk[j]);
            }
        }
        return result;
    }

    private String[][] getAllCubesOfPolinomes_plus_KeyValue_withoutMap(int[]ak,int[]bk){
        int n = ak.length;
        int m = bk.length;
        String[][] result = new String[2][n*m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[0][i*m+j] = "("+ak[i]+"a+"+bk[j]+"b)^3";
                result[1][i*m+j] = cubeOfSum(ak[i],bk[j]);
            }
        }
        return result;
    }
*/

}
