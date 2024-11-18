package RealCodes.threadfolder;

public class runnableInterface implements Runnable {
	public void run() {
		System.out.println("Thread is Running...");
		
	}
	public static void main(String[] args) {
	
		runnableInterface r = new runnableInterface();
		Thread t = new Thread(r);
		t.start();
	}

}
