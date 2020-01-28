package ch12_Generics_enums_annotation;

import javax.swing.JOptionPane;

public class ThreadEx14 {
	public static void main(String[] args) {
		Thread th2 = new Thread();
		ThreadEx14_1 th1 = new ThreadEx14_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+" 입니다.");
		th1.interrupt();
		System.out.println("isInterrupted() :"+ th1.isInterrupted());
	}
	
	
}
