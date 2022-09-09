import java.util.Scanner;
class Division
{
    public static void main(String args[])
    {
        float a,b,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        d=a*b;
        System.out.format("%.2f",d);
        sc.close();
    }
}