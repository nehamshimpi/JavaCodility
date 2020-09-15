
public class Assignment16Thread {

	public static void main(String[] args) {
		Assignment16PrintSequenceRennable runnable1 = new Assignment16PrintSequenceRennable(1);
		Assignment16PrintSequenceRennable runnable2 = new Assignment16PrintSequenceRennable(2);
		Assignment16PrintSequenceRennable runnable3 = new Assignment16PrintSequenceRennable(0);

		Thread t1 = new Thread(runnable1, "T1");
		Thread t2 = new Thread(runnable2, "T2");
		Thread t3 = new Thread(runnable3, "T3");

		t1.start();
		t2.start();
		t3.start();
	}

}
