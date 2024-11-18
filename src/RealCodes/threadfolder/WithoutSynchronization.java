package RealCodes.threadfolder;

public class WithoutSynchronization {
	class table{
		public void print (int n)  {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
	
					e.printStackTrace();
				}
			}
		}
	}

class thread extends Thread{
	table t;
	thread(table t){
		this.t = t;
	}
	public void run()  {
		t.print(5);
	}
}


class thread1 extends Thread{
	table t;
	thread1(table t){
		this.t = t;
	}
	public void run() {
		t.print(100);
	}
}
	public static void main(String[] args) {
		WithoutSynchronization a= new WithoutSynchronization();
		table t = a.new table();
         thread t1 = a.new thread(t);  
         thread1 t2 = a.new thread1(t); 
         t1.start();
         t2.start();
	}

}
