import java.util.*;
class Prog
{
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m;
        m=sc.nextInt();
        float sum=0;
        for(int i=1;i<=m;i++)
        {
            sum+=1.0/i;
        }
        System.out.format("%.2f",sum);
    }
}