import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,rev=0,r,temp;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }
}