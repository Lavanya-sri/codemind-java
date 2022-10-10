import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,c=0,count=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<a || arr[i]>b)
            {
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}