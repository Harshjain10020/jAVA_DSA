import java.security.PublicKey;

public class palindrome_string {
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                //not a palindrome
                return false;
            }
        }
        return true;
    }



    public static float getShortpath(String path){
        int x = 0 , y = 0;
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            //south 
            if (direction == 'S') {
                y--;
            }
            //north
            else if (direction == 'N') {
                y++;
            }else if (direction == 'E') {
                x++;
            }else  {
                //west
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2); 
    }

    public static String subString(String str , int si , int ei ){
        String substr = "";
        for (int i = 0; i < ei; i++) {
            substr += str.charAt(i);

        }
        return substr;
    }




    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== ' '&& i < str.length()-1 ) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }


    public static String compreString(String str){
        String newstr = "";
        for (int i = 0; i <str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i +1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count >1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }
    
    public static void main(String[] args) {
        // String str = "raceecar";
        // System.out.println(isPalindrome(str));
        // String path = "WNEENESENNN";
        // String str = "hello world";
        // System.out.println(str.substring(0,5));
        // String fruits[] = { "apple","mango","banana"};
        // String largest = fruits[0];
        // for (int i = 0; i < fruits.length; i++) {
        //     if (largest.compareTo(fruits[i]) <0) {
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);
        // System.out.println(subString(str, 0, 5));
        // System.out.println(getShortpath(path));
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // System.out.println(toUppercase(str));
        String str = "abc";
        System.out.println(compreString(str));

     }
}
