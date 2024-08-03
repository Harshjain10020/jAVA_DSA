import java.util.*;
public class input {
    public static void main( String[] args){
        try (// input 
        Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b ;
            System.out.println(sum);
            System.out.println(name);
        }
    }
}