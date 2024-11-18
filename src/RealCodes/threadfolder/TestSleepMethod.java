package RealCodes.threadfolder;

public class TestSleepMethod extends Thread{
public void run() {
	for(int i =0; i<=5;i++) {
		try {
			Thread.sleep(500);//for negative value - java.lang.IllegalArgumentException
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) throws InterruptedException {
		TestSleepMethod t = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		TestSleepMethod t1 = new TestSleepMethod();
		t2.start();
		t2.join();
		t.start();
		t1.start();
		/*
		t1.start();       Can't start Thread Twice once Thread Starts.
		                   otherwise it throws Exception - java.lang.IllegalThreadStateException
		*/
	}

}
