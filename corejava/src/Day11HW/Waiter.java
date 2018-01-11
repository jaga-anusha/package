package Day11HW;

public class Waiter implements Runnable {
	private Message msg;

	public Waiter(Message m) {
		this.msg = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Name " + name);
		
		synchronized (msg) {
			try {
				System.out.println(name + " waiting to get notified at time:");
				msg.wait(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			msg.notifyAll();
			System.out.println(name + " waiter thread got notified at time:");
			System.out.println(name + " processed: " + msg.getMsg());
		}
	}
}