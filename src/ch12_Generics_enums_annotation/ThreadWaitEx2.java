package ch12_Generics_enums_annotation;

public class ThreadWaitEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table2 table = new Table2();
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "dounut"), "CUST1").start();
		new Thread(new Customer(table, "bugger"), "CUST2").start();
		
		Thread.sleep(100);
		System.exit(0);
	}

}
