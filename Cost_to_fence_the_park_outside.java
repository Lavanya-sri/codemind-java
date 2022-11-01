import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,c,w,area;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        area=((l+2*w)*(b+2*w)-l*b);
        System.out.println(area*c);
        sc.close();
    }
}