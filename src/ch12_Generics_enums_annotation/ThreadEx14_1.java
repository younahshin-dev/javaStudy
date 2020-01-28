package ch12_Generics_enums_annotation;

public class ThreadEx14_1 extends Thread {

	public void run() {
		int i = 10;
		
		while (i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000); //1초지연
			} catch (InterruptedException e) {
//				interrupt();
			}
		}
		
		System.out.println("카운트가 종료되었습니다.");
	}

}
