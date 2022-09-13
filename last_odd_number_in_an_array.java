import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,c=0,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //k=sc.nextInt();
        for(i=n-1;i>=0;i--)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
                break;
            }
        }
       // System.out.println(c);
    }
}