public class d4 {


    public static void reverse_num(int n){
        while (n>0) {
            int lasdigit = n%10 ;
            System.out.print(lasdigit);
            n= n/10;
            
        }

    }
    public static void main(String[] args) {
        //reverse of a number 
        reverse_num(29062004);
        
        


        // //ternary operator
        
        // //variable = condition? statement1 : statement2 ;
        // String type = ((n%2 ==0))? "even":"odd";
        // System.out.println(type);


        //switvh
        // switch (args) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }
    }
}
