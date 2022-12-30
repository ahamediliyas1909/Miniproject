package Variables;

public class variablesEx3 {
	
	int a = 10;
	int b = 20;

	void add(int a, int b) {
		
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variablesEx3 vEx3 = new variablesEx3();
		vEx3.add(100, 200); 
		

	}

}
