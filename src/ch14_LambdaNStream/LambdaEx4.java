package ch14_LambdaNStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		
		//list의 모든 요소를 출력
		list.forEach( i -> System.out.println(i+","));
		System.out.println();
		
		//list에서 2또는 3의 배수를 제거한다.
		list.removeIf(x -> x%2 == 0 || x%3 == 0);
		System.out.println(list);
		
		list.replaceAll(i -> i*10); //list 의 각요소에 10곱하기
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		map.forEach((k, v) -> System.out.println("{"+k+", "+v+"}"));
		System.out.println();
	}

}
