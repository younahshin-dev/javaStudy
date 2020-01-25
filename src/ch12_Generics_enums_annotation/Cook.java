package ch12_Generics_enums_annotation;

import javafx.scene.control.TableSelectionModel;

public class Cook implements Runnable{
	private Table table;

	Cook(Table table) {
		this.table = table;
	}
	
	public void run() {
		while (true) {
			int index = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[index]);
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
