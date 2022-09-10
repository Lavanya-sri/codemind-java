import java.util.Scanner;
class Season
{
    public static void main(String args[])
    {
        int a,temp,d,rev=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        temp=a;
        while(a>0)
        {
            d=a%10;
            rev=rev*10+d;
            a=a/10;
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        sc.close();
    }
}