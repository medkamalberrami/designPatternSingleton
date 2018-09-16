package designPatternSingleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Singleton {
	
	public String[] Letters = {"a","b","c","d","e"};
	
	private List<String> data = Arrays.asList(Letters);

	private static final Singleton singleton;
	
	static {
		singleton = new Singleton();
	}
	
	public static Singleton getInstance() {
		
		return singleton;
	}
	
	private Singleton() {
		System.out.println(data);

			Collections.shuffle(data);
			
	}
	
	public void returnData() {
		
		for(String item :data) {
			System.out.printf("%s ",item);
		}
	}
	
	
	

}
