import java.util.*;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=0;
        for(int j=1;j<10000;j++)
        {
            m=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==j)
                {
                    m++;
                }
            }
            if(m==0)
            {
                System.out.println(j);
                break;
            }
        }
    }
}