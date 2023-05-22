package task3;

public class Multithread implements Runnable {
public static void main(String[] args) {
	Thread thread1=new Thread("sights1");
	Thread thread2=new Thread("sights2");
	thread1.start();
	thread2.start();
	System.out.println(thread1.getName());
	System.out.println(thread2.getName());
	System.out.println("thread is successfully...");
}

@Override
public void run() {
	
	
}
}
