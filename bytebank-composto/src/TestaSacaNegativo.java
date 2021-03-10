
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(1000);
		
			
		System.out.println("Conta depois do depósito :" + conta.getSaldo());
			
		conta.saca(4000);
		
		System.out.println("Saque conta sem limite : " + conta.getSaldo());
		
		conta.defineLimite(5000);
		
		conta.saca(1400);
		
		System.out.println("Saque conta com limite : " + conta.getSaldo());		
	}
}
