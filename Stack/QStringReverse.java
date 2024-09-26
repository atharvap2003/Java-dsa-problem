import java.util.*;

public class QStringReverse {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        StringBuilder res = new StringBuilder("");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            s.push(ch);
        }
         
        while(!s.isEmpty()){
            res.append(s.pop());    
        }
        System.out.println(res);

    }    
}
