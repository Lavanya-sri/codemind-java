import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,c=0,j,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            if(arr[i]==-1)
            {
                continue;
            }
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    arr[j]=-1;
                }
            }
            if(c==0)
            {
                y=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(y==0)
        {
            System.out.print("-1");
        }
        
    }
}