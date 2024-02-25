public class GreaterAmong2JAVA 
{
  
	public static void main(String[] args) 
	{
		int num1,num2,ans;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		ans=num1>num2?num1:num2;
		System.out.println("the greater number is= "+ans);

	}

}
