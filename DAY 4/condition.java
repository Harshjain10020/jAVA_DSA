
public class condition {
    public static void main(String[] args) {
        // int x = 15;
        // if (x >= 18){
        //     System.out.println("adult");
        // }if(x > 13 && x<18 ){
        //     System.out.println("teenage");
        // }
        
        // else {
        //     System.out.println("naballik");
        // }
        // int A = 1;
        // int B = 3;
        // if (A>B){System.out.println("A");}
        // else{System.out.println("B");System.out.println("h");}
        // Scanner sc = new Scanner(System.in);
    
        // int num = sc.nextInt() ;
        // if (num%2 == 0){System.out.println("even");}
        // else{System.out.println("odd");}
    //     int A = 1;
    //     int B = 3;
    //     int C = 4;

    //     if (( A >= B) && (A >= C)){
    //         System.out.println("A");}
    //     else if(B>C) {
    //         System.out.println("B");
    //     }
    //     else{
    //         System.out.println("C");
    //     }

    // }
    int num = 29062004;
    while(num > 0){
        int lastdigit = num % 10;
        System.out.print(lastdigit +" ");
        num = num /10;
    }
    System.out.println( );

    

}
}