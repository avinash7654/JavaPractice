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
        st.add("Green");
        st.add("Yello");
        st.add(null);
        st.add("Pink");
        st.add("red");
        st.add("red");
        st.add(null);
        System.out.println(st);
        
	}

}
