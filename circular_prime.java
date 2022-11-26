import java.util.Scanner;
class Prog
{
    static boolean prime(int n)
    {
        int c=0;
        if(n>1)
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    c=1;
                }
            }
        }
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0,y=0;
        int c=0,m=0;
        int rev=0,r,temp=n;
        while(temp>0)
        {
            r=temp%10;
            rev=rev*10+r;
            temp=temp/10;
        }
        if(prime(n))
        {
            c=c+1;
            if(prime(rev))
            {
                m=m+1;
            }
        }
        if(c==1 && m==1)
        {
            System.out.print("circular prime");
        }
        else if(c==1 && m==0)
        {
            System.out.print("prime but not a circular prime");
        }
        else
        {
            System.out.print("not prime");
        }
    }
}