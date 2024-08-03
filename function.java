// import java.util.*;
// import java.math.*;
public class function {

    public static void Helloworld(){
        System.out.println("hey world");
        System.out.println("hey ");
        System.out.println("world");
        return;
    }
    
    


    public static int calcsum(int a , int b) {
        // Helloworld();//funaction call
        
        int sum = a + b;
        return sum; 
        
    }
    public static void swap(int a , int b) {
        
        //swap 
        int temp = a;
        a= b;
        b= temp;
        System.out.println(a);
        System.out.println(b);
    }
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     // int a = sc.nextInt();
    //     // int b = sc.nextInt();
    //     // int sum = calcsum(a,b);
        
    //     // System.out.println("sum is :"+ sum);
    //     int a = 6;
    //     int b = 7;
    //     //swap 
    //     swap(a, b);
    //  }
    public static int multiply(int a , int b ){
        int product = a*b;
        return product;
    }

    // public static void main(String[] args) {
    //     int prod = multiply(3, 5);
    //     System.out.println(prod);
    //     prod = multiply(63, 2);
    //     System.out.println(prod);
    // }

    //factorial
    public static int fact(int a){
        int f = 1;
        for(int i = 1; i<=a ; i++){
            f = f*i;
        }
        return f;
    }
    // public static void main(String[] args) {
    //     System.out.println(fact(4));
    // }

    //binomialcoeffiecient 
    public static  int bino(int n , int r){

        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);
        int binoco = a/(b*c);

        return binoco;
    }
    

    public static int sum (int a , int b ){
        
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    // public static void main(String[] args) {
    //     //System.out.println(bino(5, 2));
        
    //     System.out.println(sum(2,3 ));
    //     System.out.println(sum(3.5f,3.6f ));
    // }


    //prime number 
    public static boolean isPrime(int n ){
        boolean isPrime = true;
        if (n==2) {
            return true;
            
        }
        for (int i = 2; i <= n-1; i++) {
            if (n%2==0) {
                isPrime=false;
                break;
            }
            
        }
        return isPrime;

    }

    

    //prime 2nd method optimized one
    public static boolean isprime(int n ){
        boolean isPrime = true;
        if (n==2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                isPrime=false;
                break;
            }
            
        }
        return isPrime;
    } 


    //prime in a range n= 10 
    public static void PrimeRanged(int a){
        for (int i = 2; i <=a ; i++) {
            if (isPrime(i)) {
                System.out.println(i+" ");
                
            }
            System.out.println();
            
        }
    }
    // public static void main(String[] args) {
        
    // //     System.out.println(isPrime(12));
    // //     System.out.println(isprime(5));
    // // }
    //     PrimeRanged(20);
    // }

    //Binaty to Decimal 
    

}