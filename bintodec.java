public class bintodec {
    public static void bintodeci(int num) {
        int myNUM = num;
        int pow = 0;
        int DecNum = 0;

        while (num>0) {
            int Lastdigit= num%10;
            DecNum = DecNum + (Lastdigit*(int)Math.pow(2,pow));
            pow++;
            num = num/10;
        }

        System.out.println("decimal Number of "+myNUM + " is : " + DecNum);
    }
    public static void main(String[] args) {
        bintodeci(111);
    }
}
