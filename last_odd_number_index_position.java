import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        int n,i,c=0,avg,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=n-1;i>=1;i--)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(i);
                break;
            }
        }
        
    }
}