package ch12_Generics_enums_annotation;

public final class Optional<T> {
	private static final Optional<?> EMPTY = new Optional<>();
//	private final T value;
	
	public static<T> Optional<T> empty() {
		Optional<T> t = (Optional<T>) EMPTY;
		return t;
	}
	
	Optional<?> wopt = new Optional<Object>();
	Optional<Object> oopt = new Optional();
	
	Optional<String> sopt = (Optional<String>)wopt;	//형변환 가능
//	Optional<String> sopt = (Optional<String>)oopt; //형변환 불가능 error
}
