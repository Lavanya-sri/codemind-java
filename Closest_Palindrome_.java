import java.util.*;
import java.lang.Math;
class Prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,rev=0,temp,k=0;
        for(int i=n-1;i>0;i--)
        {
            rev=0;
            temp=i;
            while(temp>0)
            {
                r=temp%10;
                rev=rev*10+r;
                temp=temp/10;
            }
            if(rev==i)
            {
                k=i;
                break;
            }
        }
        int l=0,d,tempp,revv=0;
        for(int j=n+1;j>n;j++)
        {
            revv=0;
            tempp=j;
            while(tempp>0)
            {
                d=tempp%10;
                revv=revv*10+d;
                tempp=tempp/10;
            }
            if(revv==j)
            {
                l=j;
                break;
            }
        }
        int x=n-k;
        int y=l-n;
        if(x<y)
        {
            System.out.println(k);
        }
        else if(y<x)
        {
            System.out.println(l);
        }
        else
        {
            System.out.println(k+" "+l);
        }
    }
}