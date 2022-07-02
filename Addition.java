public class Addition
{
  public static void main(String args[])
  {
    Addition ad=new Addition();
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int result=ad.add(a,b);
	 System.out.println("result = "+result);
  }
  public int add(int a,int b)
  {
     return a+b;
  }

}

