
public class Assignment16PrintSequenceRennable implements Runnable {

	public int PRINT_NUMBERS_UPTO = 10;
	static int number = 1;
	int remainder;
	static final Object lock = new Object();

	Assignment16PrintSequenceRennable(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO - 1) {
			synchronized (lock) {
				while (number % 3 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}
