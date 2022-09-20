import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        int n,i,min=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            min=arr[i];
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
       
    }
}