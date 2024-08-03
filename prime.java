//Write a program in java to display 10 prime numbers ( 2,3,5,7,11,13,)//
public
class prime
{
    public static void main(String args[])
    {
        int n=10;
        int status = 1;
        int num = 3;
        if (n >= 1)
        {
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}