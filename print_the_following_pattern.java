import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
    }
}