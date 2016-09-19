package javaReferesher;

public class Multithread implements Runnable {
	
	private String threadName;
	private int base,height;
	
	public Multithread(String threadName,int base,int height) {
		// TODO Auto-generated constructor stub
		this.threadName = threadName;
		this.base = base;
		this.height = height;
		
	}
	public void findArea(int base,int height){
		
		System.out.println("Thread - "+threadName+" calculating area of the treangle.");
		System.out.println("Area = "+"$"+(base * height ) * 0.5);
		System.out.println("Thread - "+threadName+" suspended.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to thread - "+threadName);
		System.out.println("Loading.....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		findArea(base,height);
		
	}

	public static void main(String args[]){
		
		Thread t1 = new Thread(new Multithread("thread1", 80,10));
		t1.start();
		Thread t2 = new Thread(new Multithread("thread2", 100,15));
		t2.start();
	}


}
