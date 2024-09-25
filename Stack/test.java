import java.util.*;
// LIFO - Last in First Out:

public class test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(36);

        System.err.println(stack.size());
        System.out.println(stack.peek());
        System.err.println(stack.pop());
        System.out.println(stack.indexOf(35));
        System.out.println(stack.isEmpty());
        //return the element which will pop!
    }
}
