
public class TesteFatorial {
	
	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for (int n = 1 ; n <= 10 ; n++) {
						
			System.out.println(fatorial * n);
			
			fatorial = fatorial * n;
		}
	}
}
