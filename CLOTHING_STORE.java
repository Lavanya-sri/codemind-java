import java.util.*;
class Prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,y=0;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    arr[j]=0;
                    break;
                }
            }
           
        }
        System.out.println(c);
        
    }
}