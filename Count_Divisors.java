import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        
        int a,b,c,count=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                count++;
            }
        }
       System.out.println(count);
         
    }
}