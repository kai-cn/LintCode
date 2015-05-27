
public class ABProblem {

	public static void main(String[] args) {
		System.out.println(aplusb(-120,890));
		System.out.println(aplusb(7,2));
		System.out.println(aplusb(-100,100));
	}
	
	public static int aplusb(int a, int b) {
		
		
		int c;

		do {
			c = a&b;
			b = a^b;
			a = c << 1;	
		}while(a != 0);
		

		
		return b;
	}

}
