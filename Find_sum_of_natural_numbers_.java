import java.util.Scanner;
class prog
{
    public static void main(String args[])
    {
        int n,x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=(n*(n+1)/2);
        System.out.println(x);
        sc.close();
    }
}