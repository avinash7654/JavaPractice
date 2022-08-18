import java.util.ArrayList;
import java.util.Collection;

public class ColMethodDemo {
	public static void main(String[] args) {
 Collection<String> cscol=new ArrayList<String>();
    cscol.add("Robert");
    cscol.add("Alexa");
    cscol.add("Rick");
    cscol.add("Edward");
    Collection<String> elcol=new ArrayList<String>();
    elcol.add("Modi");
    elcol.add("Rahul");
    elcol.add("Amit");
    elcol.add("Mamta");
    Collection <String> macol=new ArrayList<String>();
    macol.add("Gandhi");
   Collection <String> ancol=new ArrayList<String>();
   Collection <String> Aacol=new ArrayList<String>();
    Aacol.add("Avinash");
    Aacol.addAll(cscol);
    Aacol.addAll(ancol);
    Aacol.addAll(elcol);
    Aacol.addAll(macol);
    Aacol.addAll(Aacol);
    System.out.println(elcol.size());
    System.out.println(elcol.isEmpty());
    cscol.add("Avinash");
    cscol.remove("rick");
    System.out.println(cscol);
    
   // elcol.removeAll(elcol);
 //   elcol.containsAll(elcol);
 //   elcol.clear();
    System.out.println(elcol.contains("Modi"));
    Object[] arr=cscol.toArray();
    Object[] ar=elcol.toArray();
	}
	

}
