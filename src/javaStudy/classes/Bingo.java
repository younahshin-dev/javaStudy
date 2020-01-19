package javaStudy.classes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set set = new HashSet();
		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		for (int i= 0; i<5; i++) {
//		System.out.println((int)(Math.random()*50)+1+"");
		System.out.println((int)Math.random());
		//int i1 = (int)(Math.random()*50);
		}
		
		for (int i= 0; set.size() < 25; i++) {
			
			set.add((int)Math.random()*50+1+"");
		}
		Iterator it = set.iterator();
		
		
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board.length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print(" "+board[i][j]);
			}
			System.out.println();
		}
		
	}

}
