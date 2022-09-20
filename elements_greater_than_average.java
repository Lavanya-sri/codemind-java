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
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=avg)
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
}