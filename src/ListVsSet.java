import java.util.*;

public class ListVsSet {
	public static void main(String[] args) {
		List<String> lst=new LinkedList<String>();
		lst.add("red");
	    lst.add("yellow");
	    lst.add("White");
	    lst.add("Green");
	    lst.add(null);
		lst.add("Orange");
		lst.add("red");
		
		System.out.println(lst);
		Set <String> st=new HashSet<String>();
        st.add("1");
        st.add("2");
        st.add(null);
        st.add("3");
        st.add("4");
        st.add("5");
        st.add(null);
        System.out.println(st);
        
	}

}
