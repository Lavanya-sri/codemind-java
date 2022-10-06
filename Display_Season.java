import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>12)
        {
            System.out.println("-1");
        }
        if(n==4 || n==5 || n==6)
        {
            System.out.print("Summer");
        }
        if(n==7||n==8||n==9||n==10)
        {
            System.out.print("Rainy");
        }
        if(n==11||n==12||n==1)
        {
            System.out.print("Winter");
        }
        if(n==2||n==3)
        {
            System.out.print("Spring");
        }
    }
}