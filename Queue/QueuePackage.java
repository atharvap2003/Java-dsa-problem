import java.util.*;
// Queue using Java Collection Framework(JCF)!
public class QueuePackage {

    public static void main(String[] args) {
        // Note: Queue is Interface 
        Queue<Integer> q = new LinkedList<>(); // can be applied using ArrayDeque, Linkedlist  only!
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.err.println(q.remove());
        }
    }
}
