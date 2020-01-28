package ch12_Generics_enums_annotation;

public class ThreadEx7_1 implements Runnable {
	public void run() {
		for (int i = 10 ; i > 0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
