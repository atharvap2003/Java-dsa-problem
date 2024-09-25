import java.util.*;

class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("b");
        list.addFirst("a");

        list.add("y"); // addlast by default
        list.addLast("z");
        System.out.println(list);

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println("First element Removed: "+list);

        list.removeLast();
        System.out.println("Last element Removed: "+list);

        list.remove(0);
        System.out.println("First Element Removed: "+list);
    }    
}
