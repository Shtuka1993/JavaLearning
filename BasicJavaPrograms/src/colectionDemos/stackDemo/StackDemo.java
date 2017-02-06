package colectionDemos.stackDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> num = new Stack<Integer>();
        for(int i = 0; i<10; i++)
            num.push(i);
        for(int i=0; i<num.size();i++)
            System.out.println(num.get(i));
        System.out.println("Element poped:"+num.pop());
        System.out.println("First Element:"+num.firstElement());
        System.out.println("Last Element:"+num.lastElement());
        System.out.println("Position of 6:"+num.search(6));
    }

}
