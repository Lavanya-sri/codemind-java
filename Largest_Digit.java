import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,r,max=0,t;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        t=a;
        while(t>0)
        {
            r=t%10;
            if(r>max)
            {
                max=r;
            }
            t=t/10;
        }
        System.out.println(max);
        
    }
}