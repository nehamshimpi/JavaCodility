
public class Assignment3Vehical implements Comparable<Assignment3Vehical>{
	
	int vecNum;
	int time;
	String vecModel;
	
	Assignment3Vehical(int vecNum, String vecModel, int time)
	{
		this.vecNum=vecNum;
		this.vecModel=vecModel;
		this.time=time;
	}

	public int compareTo(Assignment3Vehical o) {
		// TODO Auto-generated method stub
		return o.time-this.time;
	}

	
	

}
