package ch12_Generics_enums_annotation;

public class ThreadEx19 {
	static long startTime = 0;
	public static void main(String[] args) {
		ThreadEx19_1 th1 = new ThreadEx19_1();
		ThreadEx19_2 th2 = new ThreadEx19_2();
		
		th1.start();
//		th1.run();
		th2.start();
		
		startTime = System.currentTimeMillis();
//		try {
//			th1.join();
//			th2.join();
//		} catch(InterruptedException e) {
			
//		}
		
		System.out.println("요요요요 : "+(System.currentTimeMillis() - startTime));
	}

}
