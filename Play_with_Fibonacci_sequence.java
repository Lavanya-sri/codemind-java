import java.util.*;
class Prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n,i;
        n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
       for(i=3;i<=n;i++)
       {
          c=a+b;
          System.out.print(c+" ");
          a=b;
          b=c;
        }
    }
}