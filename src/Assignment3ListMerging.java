import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Assignment3ListMerging {
	
	public static void main(String[] args) {
		
		
	
		List<Assignment3Vehical> list1= new ArrayList<Assignment3Vehical>();
		List<Assignment3Vehical> list2=new ArrayList<Assignment3Vehical>();
		
		list1.add(new Assignment3Vehical(2500, "Honda Odyssey", 60));
		list1.add(new Assignment3Vehical(2501, "Honda Accord", 120));
		list2.add(new Assignment3Vehical(2502, "Honda Pilot", 140));
		list2.add(new Assignment3Vehical(2503, "Honda Civic", 180));
		
		List<Assignment3Vehical> merged = new ArrayList<Assignment3Vehical>(list1);
		merged.addAll(list2);
		
		Collections.sort(merged);
		
		Iterator<Assignment3Vehical> iterator = merged.iterator(); 
		System.out.println("Returns Vehicle list with highest parked hour info");
		while (iterator.hasNext()) 
		{
			Assignment3Vehical rank = (Assignment3Vehical) iterator.next();
			System.out.println(rank.vecNum + "-------" + rank.vecModel + "------" + rank.time );
			break;
		}
		
	}

}
