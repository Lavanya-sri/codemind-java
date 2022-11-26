import java.util.*;
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
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int c=0;
        for(int i=max;i>0;i--)
        {
            c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]%i==0)
                {
                    c+=1;
                }
            }
            if(c==n)
            {
                System.out.println(i);
                break;
            }
        }
    }
}