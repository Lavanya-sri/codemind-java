import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        
        int n,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int x:arr)
        {
            sum=sum+x;
        }
        System.out.println(sum);
      
    }
}