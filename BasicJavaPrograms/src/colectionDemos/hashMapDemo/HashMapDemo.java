package colectionDemos.hashMapDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> record = new HashMap<String,String>();
        record.put("1234567890","SpiderMan");
        record.put("0987654321","BatMan");
        record.put("6761878478","SuperMan");
        record.put("9999999999","IronMan");
        record.put("0000000000","Hulk");
        for(Entry<String,String> e:record.entrySet())
            System.out.println(e.getKey()+"-"+e.getValue());
        System.out.println("Size:"+record.size());
        System.out.println("Record removed:"+record.remove("1234567890"));
        System.out.println("Record removed:"+record.remove("6761878478"));
        System.out.println("Size:"+record.size());
    }

}
