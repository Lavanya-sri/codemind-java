import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        int n,i,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(i=0;i<n;i++)
        {
            
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
       
    }
}