import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        int n,i,c=0,sum=0;
        float avg;
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
        avg=(float)(sum)/n;
        System.out.format("%.2f",avg);
        
    }
}