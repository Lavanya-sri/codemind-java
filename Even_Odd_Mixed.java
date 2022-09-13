import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        
        int r=0,even=0,odd=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                even=even+1;
            }
            else if(r%2!=0)
            {
                odd=odd+1;
            }
            n=n/10;
        }
        if(even>0&&odd==0)
        {
            System.out.println("Even");
        }
        else if(even==0&&odd>0)
        {
           System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
        
        
    }
}