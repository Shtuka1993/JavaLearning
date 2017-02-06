package colectionDemos.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add("Washington");
        city.add("London");
        city.add(1,"Berlin");
        Iterator<String> iterator = city.iterator();
        System.out.println("List of cities:");
        while(iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("Size:"+city.size());
        System.out.println("City removed:"+city.remove(1));
        Object[] toArray = city.toArray();
        System.out.println("List of cities:");
        for(int i = 0; i<toArray.length; i++)
            System.out.println(toArray[i].toString());
        System.out.println("Size:"+city.size());
        while(!city.isEmpty())
            System.out.println("City removed:"+city.remove(0));
        System.out.println("Size:"+city.size());
    }

}
