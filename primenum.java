import java.util.*;
public class primenum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter your Number :");
       int N = sc.nextInt();


    //    if (N==2) {
    //     System.out.println("n is prime");
        
    //    }else{

    //     boolean isPrime = true;

    //     for (int i = 2; i <= N-1 ; i++) {
    //     if (N%i ==0 ){
    //         isPrime = false ;
    //     }

    //     }

    //     if(isPrime == true){
    //         System.out.println("n is prime");
    //     }else{
    //         System.out.println("n is not prime");
    //     }
        
    //     }
    if (N==2) {
        System.out.println("n is prime");
        
       }else{

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(N) ; i++) {
        if (N%i ==0 ){
            isPrime = false ;
        }

        }

        if(isPrime == true){
            System.out.println("n is prime");
        }else{
            System.out.println("n is not prime");
        }
        
        }
        sc.close();

    }
       
       
       
}

 