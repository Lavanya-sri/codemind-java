import java.util.Scanner;
class Prog
{
    static boolean palindrome(int k)
    {
        int x,rev=0,r;
        x=k;
        while(k!=0)
        {
            r=k%10;
            rev=rev*10+r;
            k=k/10;
        }
        if(rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int n,c=0,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=arr[i];
            if(palindrome(k))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}