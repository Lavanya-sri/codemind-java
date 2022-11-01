import java.util.*;
class Prog
{
    public static void main(String args[])
    {
        int a,rev=0,r,t;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        t=a;
        while(t!=0)
        {
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        System.out.println(rev);
    }
}