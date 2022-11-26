import java.util.Scanner;
import java.lang.Math;
class Prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=a+b;
        if(n==0)
        {
            System.out.println("0");
        }
        else
        {
            while(c<n)
            {
                a=b;
                b=c;
                c=a+b;
            }
        }
        int k,l;
        k=Math.abs(c-n);
        l=Math.abs(b-n);
        if(k<l)
        {
            System.out.println(c);
        }
        else if(l<k)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(b+" "+c);
        }
        
    }
}