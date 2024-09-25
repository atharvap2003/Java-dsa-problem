import java.util.*;



public class string1 {
    public static void main(String[] args) {
        // String a = "Atharva";
        // String b = "Atharva";
        // String name1 = new String("Atharva");
        // String name2 = new String("Atharva");

        // Integer name = new Integer(60);
        // System.out.println(name.toString());

        // System.out.println(name1.equals(name2));
        // System.out.println(a == b);
// -------
        // float z = 403.456123f;
        // System.out.printf("%.3f", z);

        // System.err.printf("Hello I am %s and I am %s", "Atharva", "College Student");

        // System.err.printf("Hello I am %.2f and I am %s ", Math.PI, "College Student");

// ---------------
        // System.out.println("a"+"b");
        // System.out.println((char) ('a'+3));
        // System.out.println("Kunal" + new ArrayList<>()); //Arraylist will converted into Strings!
        // System.out.println("Kunal" + new Integer(56)); 
        
        // String ans =  new ArrayList<>() + new ArrayList<>(); will give error!!
        // System.out.println(new Integer(0)+ "" + new ArrayList<>());
// ----------------

        // String s = "";
        // for(int i=0;i<26;i++){
        //     char ch = (char) ('a'+ i);
        //     System.out.print(ch);
        //     s = s + ch;
        // }
        // System.out.println("\n");
        // System.out.println(s);

        // not good approch as new Object is getting created!!
// -----------------------
        // Solution is::
        // StringBuilder builder = new StringBuilder();
        // for(int i=0;i<26;i++){
        //     char ch = (char) ('a'+i);
        //     builder.append(ch);
        // }
        // System.out.println(builder);
        // builder.deleteCharAt(0);
        // builder.reverse();
        // System.out.println(builder);

// -------------------------

        String name = "Atharva Pandharikar";
        String[] arr=new String[]{Arrays.toString(name.split(" "))};
        System.out.println(arr);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('A'));
        System.out.println("      Kunal  ".trim());

// -------------

    // String pa = "abcdecba"; 
    // int length = pa.length();
    // int i=0; 
    // int j = length - 1;
    // // System.out.println(length);
    //     while(j!=1){
    //         if(pa.charAt(i) != pa.charAt(j)){
    //             System.out.println("Not Palindrome");
    //             return ;
    //         }
    //         i++;
    //         j--;
    //     }
    //     System.out.println("String is Palindrome");
    // }
}
}

