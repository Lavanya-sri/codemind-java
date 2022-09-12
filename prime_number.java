import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,x=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                x++;
            }
        }
        if(x==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}