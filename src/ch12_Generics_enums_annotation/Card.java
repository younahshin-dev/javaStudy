package ch12_Generics_enums_annotation;

public class Card {
	static final int CLOVER = 0;
	static final int HEART = 1;
	static final int DIAMOND = 2;
	static final int SPADE = 3;
	
	static final int TWO = 0;
	static final int THREE = 1;
	static final int FOUR = 2;
	
//	final int kind;
//	final int value;
	
	/*enum*/
	enum Kind { CLOVER, HEART, DIAMOND, SPADE } //열겨형 Kind를 정의
	enum Value { TWO, THREE, FOUR }
	
	final Kind kind = Kind.CLOVER;
	final Value value = Value.FOUR;
	
	void test() {
		if (kind == Kind.SPADE) {
			
//		} else if (kind > Kind.SPADE) {
		} else if (kind.compareTo(Kind.SPADE) >0) {
			
		}
	
	}
	
	
}
