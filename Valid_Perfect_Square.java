import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,t,c=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            c=0;
            for(i=1;i<=n;i++)
            {
                if(n==i*i)
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
                //System.out.println(" ");
            }
            t--;
        }
       
        
    }
}