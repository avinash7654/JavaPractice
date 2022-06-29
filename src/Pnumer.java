
public class Pnumer {
	public static void main(String[] args) {
		int a=92;
		boolean flag= true;
		int i;
		for( i=2;i<=a/2;i++)
			if(a%i==0)
			{
				flag=false;
				break;
			}
      if(flag)
      { 
    	  System.out.println("is   a primenumber");

	}
      else
      {
    	  System.out.println("is not  primenumber");
      }
	}

}
