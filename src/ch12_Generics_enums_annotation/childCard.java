package ch12_Generics_enums_annotation;

public class childCard extends Card {

	public static void main(String[] args) {
		Card card = new Card();
		
		System.out.println(card.CLOVER == card.TWO);
//		System.out.println(card.kind.CLOVER == card.value.TWO);
		
		Kind[] kArr = Kind.values();
		for (Kind k : kArr) {
			System.out.println(k.name()+" : "+k.ordinal());
		}
	}
}
