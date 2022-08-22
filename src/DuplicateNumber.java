import java.util.HashSet;
import java.util.Set;
public class DuplicateNumber{
	public static void main(String[] args) {
		int arr[]= { 1,2,3,4,2,2,2,3,5,3,6};
		System.out.println("duplicate element are:");
		Set<Integer>  st=new HashSet<Integer>();
		for(int no:arr)
		{
		if (st.add(no)==false)
		{
		System.out.println(no+" ");	
		}
		}
			
		
	}
}
