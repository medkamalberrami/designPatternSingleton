package designPatternSingleton;

public class testSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		Singleton sin1 = Singleton.getInstance();
		Singleton sin2 = Singleton.getInstance();

		
		System.out.println(sin1.hashCode());
		sin1.returnData();
		
		System.out.println("***********");
		System.out.println(sin2.hashCode());
		sin2.returnData();

		

		

	}

}
