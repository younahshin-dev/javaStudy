package ch12_Generics_enums_annotation;

public class ThreadWaitEx3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table3 table = new Table3();
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "dounut"), "CUST1").start();
		new Thread(new Customer(table, "bugger"), "CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
