package ch12_Generics_enums_annotation;

import java.util.ArrayList;

public class Table2 extends Table {
	String[] dishNames = {"dounut", "dounut", "bugger"};
	
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<String>();
	
	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD) {
			return;
		}
		
		dishes.add(dish);
		System.out.println("Dishes : "+dishes.toString());
	}
	
	public void remove(String dishName) {
		synchronized(this) {
			while(dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting.");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {}
			}
			for(int i = 0; i < dishes.size(); i++) {
				if (dishName.contentEquals(dishes.get(i))) {
					dishes.remove(i);
					return;
				}
			}
		}
		return;
	}
	
	public int dishNum() { return dishNames.length; }
}
