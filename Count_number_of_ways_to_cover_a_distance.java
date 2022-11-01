import java.util.*;
class Prog
{
    public static int res(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        return res(n-1)+res(n-2)+res(n-3);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(res(n));
    }
}