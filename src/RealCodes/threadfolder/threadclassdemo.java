package RealCodes.threadfolder;
/*
thread is a class.Runnable is a interface.
thread has start(),runnable has run(),starts() calls Run() Internally.
By Calling Start() We can create a New Thread.
By Calling Run() Directly We can't create a New Thread.


*/

public class threadclassdemo extends Thread {
	
		public void run() {
			System.out.println("Thread is Running...");
			//System.out.println();
		}
		
		
	
	public static void main(String[] args) {
		threadclassdemo t =new threadclassdemo();
		t.start();

	}

}
