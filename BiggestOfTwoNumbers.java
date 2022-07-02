import java.util.Scanner;
public class BiggestOfTwoNumbers
{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int a;
   int b;
   int c;
   System.out.println("Enter first number ?");
   a=Integer.parseInt(sc.nextLine());
   System.out.println("Enter Second number ?");
   b=Integer.parseInt(sc.nextLine());
   if(a>b)
   System.out.println("First number is big"+a);
   else
   System.out.println("Secod Number is big"+b);
   }
   }
   