import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        
        int k,a,b,rev=0,r,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<b;i++)
        {
            k=i;
            rev=0;
            while(k!=0)
            {
                r=k%10;
                rev=rev*10+r;
                k=k/10;
            }
            if(rev==i)
            {
                System.out.print(i+" ");
            }
        }
        
         
    }
}