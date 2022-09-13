import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        
        int a,t,fact=1,i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            fact=1;
            for(i=1;i<=a;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
            t--;
            
        }
        
         
    }
}