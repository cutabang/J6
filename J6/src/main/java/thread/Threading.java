package thread;

public class Threading {
	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		MyThread mt1 = new MyThread(); 
		mt1.setName("fab thread");
		
		mt1.start();
	}
	
	public static void test2() {
		MyRunnable target = new MyRunnable();
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target, "fab runnable thread");
		
		t1.start();
		t2.start();
	}
}
