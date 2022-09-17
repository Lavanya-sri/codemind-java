import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int c,n,i,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        c=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]+c>=max)
            {
                max=arr[i];
                System.out.print("True"+" ");
            }
            else
            {
                System.out.print("False"+" ");
            }
        }
    }
}