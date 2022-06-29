
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 101;
		boolean flag = true;
		int i;
		for (i = 2; i <= num / 2; i++)
			
		{

			if (num % i == 0) {
				flag = false;
				break;
			}
		}
			if (flag)

				System.out.println("is  primenumber!!!!");

			else

				System.out.println("is  not primenumber!!!");
		}
	}

