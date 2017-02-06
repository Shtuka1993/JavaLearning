package garbageCollection;

public class GarbageCollection {

    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        long i,j;
        System.out.println("JVM memory before Garbage Collection:"+(i=rt.freeMemory()));
        rt.gc();
        System.out.println("JVM memory after Garbage Collection:" + (j=rt.freeMemory()));
        System.out.println("Memory freed due to Garbage Collector = " + (j-i));
    }

}
