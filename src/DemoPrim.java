public class DemoPrim {
	public static void main(String[] args) {
		int num=59;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
		if(num % i==0)
			{
			flag=true;
			
			break;
			}
		}
	if(!flag)	
	{
	System.out.println("prime number");	
	}
	else
	{
	System.out.println("not a primenuber");	
	}
	}

}
