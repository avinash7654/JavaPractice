
public class PrimeNumberCheck {

	public static void main(String[] args) {
		int number=17;
		
		int m=number/2;
		int flag=0;
		if(number==0|| number==1) {
			System.out.println("Not prime number!!");
		}
		
		else {
			for(int i=2;i<=m;i++) {
				
				if(number%i==0) {
					flag=1;
					
				}
				
				
			}
			
		}
		
		if(flag==1) {
			System.out.println("Not prime!!!");
			
			
		}
		
		else {
			System.out.println("prime!!!");
			
		}
		

	}

}
