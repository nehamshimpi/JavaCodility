import java.util.Vector;

public class Assignment6VectorAddingElement {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("T");
		v.add("e");
		v.add("k");
		v.add("a");
		v.add("r");
		v.add("c");
		v.add("h");
		
		System.out.println(v);
		for(int i=0;i<5;i++)
		{
			v.add(2, "z");
		}
		
		System.out.println(v);

	}
}
