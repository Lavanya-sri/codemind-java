import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int x,y,b,m;
        double a;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        a=Math.pow(x,y);
        b=(int)(a)%m;
        System.out.println(b);
    }
}