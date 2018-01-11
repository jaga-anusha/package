package Day11HW;

public class ThreadA {

public static void main(String[] args) {
		
		// Main Thread Started
		ThreadB b = new ThreadB();
		b.start();

		// Main Thread go inside this method
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete... went to Wait state");
				// Main Thread goes to wait state
				b.wait();
				System.out.println("Main therad Got Notified");
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + b.total);
		}
	}

}

class ThreadB extends Thread {
	int total;

	public void run() {
		
		synchronized (this) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {}
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			System.out.println("Thread B going to Notify");
			notify();
		}
	}
}


