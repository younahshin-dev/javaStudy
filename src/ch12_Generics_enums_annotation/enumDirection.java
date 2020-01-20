package ch12_Generics_enums_annotation;

public class enumDirection {
	//enum 클래스
	enum Direction { 
		EAST(1), SOUTH(5), WEST(-1), NORTH(10); //Direction 객체
		
		private final int value;
		Direction(int value) { this.value = value; } //접근제어자 private 생략됨
		public int getValue() { return value; }
	}
	
}
