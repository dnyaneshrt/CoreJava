package collection_revision;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println(stack);
        System.out.println(stack.peek());// peek returns last intserted object in stack
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("stack iteration");
        Iterator<String> it=stack.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(stack.empty());
//        stack.clear();  // will remove all elemnsts from stack
        System.out.println(stack.empty());
        System.out.println(stack.search("D"));// will return index number in reverse. indeax starts from 1
        System.out.println(stack.search("B"));
        System.out.println(stack.search("C"));

    }
}
