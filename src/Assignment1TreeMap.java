import java.util.Map.Entry;
import java.util.TreeMap;

public class Assignment1TreeMap {
	
	static TreeMap<Integer, String> treemap; 

	public static void main(String[] args) {
		
		treemap =new TreeMap<Integer, String>();
		add();
		search("1003");
		search("Neha");
		displayName();
		

	}
	
	public static void add()
	{
		
		treemap.put(1001, "Neha");
		treemap.put(1002, "Rima");
		treemap.put(1003, "Gauri");
		treemap.put(1004, "Megha");
		treemap.put(1005, "Rashmi");
		
	}
	static void search(int key) 
    { 
		System.out.println( 
            "\nIs key \""
            + key + "\" present? "
            + treemap.containsKey(key));
	
        
    } 
	
	static void search(String value) 
    { 
  
       
        System.out.println( 
            "\nIs value \""
            + value + "\" present? "
            + treemap.containsValue(value)); 
    }
	
	static void displayName() 
    { 
       
        System.out.println( 
            "\nDisplaying the Student Names:"); 
  
        System.out.println( 
            "Student names: " + treemap.values()); 
        System.out.println("Student registration number are: ");
        for (Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.print(entry.getKey() + "\n");
       }
    } 
  

}
