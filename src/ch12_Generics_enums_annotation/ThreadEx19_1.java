package ch12_Generics_enums_annotation;

public class ThreadEx19_1 extends Thread {
	public void run() {
		for(int i = 0; i< 300; i++) {
			System.out.print("-");
		}
	}
}
