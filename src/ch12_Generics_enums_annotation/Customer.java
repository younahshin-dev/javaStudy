package ch12_Generics_enums_annotation;

public class Customer implements Runnable {
	
	public Table table;
	public String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
			}
			
			String name = Thread.currentThread().getName();
			
			if (eatFood()) {
				System.out.println(name+" ate a "+food);
			} else {
				System.out.println(name+" failed to eat.");
			}
		}
	}

	boolean eatFood() {
		return table.remove(food);
	}
}
