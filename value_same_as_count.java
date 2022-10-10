import java.util.*;
class prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0,y=0,c=0;
        for(i=0;i<n;i++)
        {
            count=1;
            if(arr[i]==-1)
            {
                continue;
            }
            else
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=-1;
                    }
                }
            }
            if(count==arr[i])
            {
                y=1;
                c++;
            }
        }
        System.out.print(c);
    }
}