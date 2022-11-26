import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0,m=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
               c=i;
               m=1;
               break;
            }
        }
        if(m==1)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println("-1");
        }
        

    }
}