import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,c=0,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
               continue;
            }
            else
            {
                c++;
            }
        }
        System.out.println(c);
    }
}