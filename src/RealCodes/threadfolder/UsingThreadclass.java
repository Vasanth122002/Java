package RealCodes.threadfolder;

public class UsingThreadclass implements Runnable {
	@Override
	public void run() {
		 System.out.println("thread is running...");
		
	}
	public static void main(String[] args) {
		/*Thread t = new Thread("My first Thread...");
		t.start();
		String str = t.getName();
      System.out.println(str);
      */
		Runnable r = new UsingThreadclass();
		Thread t = new Thread(r,"my thread");
		t.start();
		String str = t.getName();
	      System.out.println(str);
	}



}
