import java.util.Scanner;
class JavaLab21
{  
   public static boolean isprime(int n)
   {
       if(n<2)
           return false;
       for(int i=2;i<=(int)Math.sqrt(n);i++)
       {
           if(n%i==0)
               return false;
       }
       return true;
   }
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n,j,a,b,c=0;
      a=sc.nextInt();
      b=sc.nextInt();
      for(j=a;j<=b;j++)
      {
         n=j;
         if(isprime(n))
        {
           c++;
         }
       
      }
      System.out.println(c);
    }
}