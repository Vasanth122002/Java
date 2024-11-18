package RealCodes.threadfolder;
/*
 if any thread is sleeping or waiting state(i.e sleep() or wait() is invoked ),calling the interrupt()
 on the thread, breaks out the sleeping or waiting state throwing InterruptedException. 
 if thread is not in the sleeping or waiting state , calling the Interrupt() performs normal behavior 
 and doesn't Interrupt but sets the interrupt flag to true.
 */
public class ThreadInterruption extends Thread{
      public void run() {
    	  for(int i=1; i<=2;i++) {
    		  if (Thread.interrupted()) {
    			  System.out.println("Code for Interrupted Thread ");
    		  }else {
    			  System.out.println("Code for normal Thread "); 
    		  }
    	  }
      }
	public static void main(String[] args) {
		ThreadInterruption t = new ThreadInterruption();
		ThreadInterruption t1 = new ThreadInterruption();
		t.start();
		t.interrupt();
		t1.start();
		t1.interrupt();
	}

}
