import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,b,c=0,t,i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
        a=sc.nextInt();
        b=sc.nextInt();
        c=0;
        for(i=a;i<=b;i++)
        {
            if(i%10==2 || i%10==3 || i%10==9)
            {
                c=c+1;
            }
        }
        System.out.println(c);
        t=t-1;
        }
    }
}