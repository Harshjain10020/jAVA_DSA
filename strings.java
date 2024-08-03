import java.util.*;
public class strings {


    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'q','f','f'};
        // String str = "abc";
        // String str2 = new String("xyz");

        // //immuatble
        // Scanner sc = new Scanner(System.in);
        // String name;
        // //name = sc.next(); // gives only 1 woRd
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());

        //concatenation 
        String firstname = "harsh ";
        String lastname = "jain";
        String fullname = firstname +" "+ lastname;
        // System.out.println(fullname);

        // //find letter place 
        // System.out.println(fullname.charAt(3));
        printletter(fullname);
    }
}
