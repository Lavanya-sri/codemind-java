import java.util.Scanner;
class Division
{
    public static void main(String args[])
    {
        int a,b,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        d=a*b;
        System.out.println(d);
        sc.close();
    }
}