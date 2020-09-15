import java.util.ArrayList;

public class Assignment7AddRemoveArrayList {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
	
	
	ArrayList<String> arrlist = new  ArrayList<String>(5);
	
	arrlist.add("Neha");
	arrlist.add("Renu");
	arrlist.add("Gauri");
	arrlist.add("Tina");
	arrlist.add("Shobha");
	
	System.out.println(arrlist);
	
	arrlist.remove(2);
	arrlist.remove(new String("Renu"));
	
	System.out.println(arrlist);

	}	
}
