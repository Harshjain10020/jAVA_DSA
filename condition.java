import java.util.*;
public class condition {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            //int y = sc.nextInt();

            switch(button){
                case 1 : System.out.println("Hello");
                break;
                case 2 : System.out.println("Namaste");
                break;
                default : System.out.println("Invalid");
            }
        }

       /* if (x == y ){
            System.out.println("Equal");
        } else if (x>y) {
            System.out.println("x is greater");
        }
        else {
            System.out.println("x is smaller");

        }

        if (x == y){
            System.out.println("equal");
        } else {
            if (x>y){
                System.out.println("x is greater than y ");
            }else{
                System.out.println("y is greater");
            }
        }
        if (x%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("ODD");

        }

        
        if(age>18){
            System.out.println("ADult");
        } else {
            System.out.println("Not adult");

        }**/



    }
}