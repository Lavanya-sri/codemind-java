import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,j,sum=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(arr[i]==k)
            {
                break;
            }
        }
        System.out.println(sum);
    }    
}