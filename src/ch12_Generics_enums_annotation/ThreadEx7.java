package ch12_Generics_enums_annotation;

import javax.swing.JOptionPane;

public class ThreadEx7 {
	public static void main(String[] args) throws Exception {
		Thread th1 = new Thread(new ThreadEx7_1());
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
	}
}
